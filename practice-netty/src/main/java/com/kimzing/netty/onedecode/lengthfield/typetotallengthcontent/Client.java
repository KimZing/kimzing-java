package com.kimzing.netty.onedecode.lengthfield.typetotallengthcontent;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/**
 * @author KimZing - kimzing@163.com
 * @since 2022/11/7 13:40
 */
public class Client {

    public static void main(String[] args) {
        NioEventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline()
                                // 在前面模拟一个type单字节，其他功能一样
                                .addLast(new MessageTypeHandler())
                                // 给内容追加长度信息，(大端序，长度四个字节，补偿值0， 长度信息中包含长度自身的长度)
                                .addLast(new LengthFieldPrepender(ByteOrder.BIG_ENDIAN, 4, 0, false))
                                .addLast(new SimpleClientHandler());
                    }
                });
        try {
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8080).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            group.shutdownGracefully();
        }
    }

    private static class SimpleClientHandler extends ChannelInboundHandlerAdapter {

        @Override
        public void channelActive(ChannelHandlerContext ctx) throws Exception {
            for (int i = 0; i < 10; i++) {
                ctx.writeAndFlush(ByteBufAllocator.DEFAULT.directBuffer().writeBytes(("第" + i + "条").getBytes(StandardCharsets.UTF_8)));
            }
            super.channelActive(ctx);
        }
    }

    private static class MessageTypeHandler extends MessageToByteEncoder<ByteBuf> {

        @Override
        protected void encode(ChannelHandlerContext ctx, ByteBuf msg, ByteBuf out) throws Exception {
            int length = msg.readableBytes();
            byte[] bytes = new byte[length];
            msg.readBytes(bytes);
            // 由于前面的处理器加入了长度信息，会发送两次消息过来。
            // 一个是长度，一个是实际的数据, 这里就写死长度固定为4
            if (length == 4) {
                out.writeByte('a');
                out.writeBytes(bytes);
            } else {
                // 非长度数据直接返回
                out.writeBytes(bytes);
            }
        }
    }
}
