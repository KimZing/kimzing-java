package com.kimzing.netty.onedecode.lengthfield.typetotallengthcontent;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldPrepender;

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
                                // 在前面添加一个type单字节
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

    private static class MessageTypeHandler extends ChannelOutboundHandlerAdapter {

        @Override
        public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
            ByteBuf byteBuf = (ByteBuf) msg;

            // 由于前面的处理器加入了长度信息，会发送两次消息过来。
            // 一个是长度，一个是实际的数据, 这里就写死长度固定为4
            if (byteBuf.readableBytes() == 4) {
                ByteBuf out = ByteBufAllocator.DEFAULT.directBuffer();
                out.writeByte('M');
                out.writeBytes(byteBuf);
                ctx.write(out, promise);
            } else {
                // 非长度数据直接返回
                ctx.write(byteBuf, promise);
            }
        }

    }
}
