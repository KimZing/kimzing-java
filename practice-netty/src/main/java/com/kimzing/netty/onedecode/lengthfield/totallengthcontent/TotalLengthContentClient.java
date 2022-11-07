package com.kimzing.netty.onedecode.lengthfield.totallengthcontent;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldPrepender;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/**
 * @author KimZing - kimzing@163.com
 * @since 2022/11/7 13:40
 */
public class TotalLengthContentClient {

    public static void main(String[] args) {
        NioEventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline()
                                // 给内容追加长度信息，(大端序，长度四个字节，补偿值0， 长度信息中包含长度自身的长度)
                                .addLast(new LengthFieldPrepender(ByteOrder.BIG_ENDIAN, 4, 0, true))
                                .addLast(new SimpleClientHandler());
                    }
                });
        try {
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8080).sync();
            channelFuture.channel().closeFuture();
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
                ctx.writeAndFlush(ByteBufAllocator.DEFAULT.directBuffer().writeBytes(("第" + i +"条").getBytes(StandardCharsets.UTF_8)));
            }
            super.channelActive(ctx);
        }
    }
}
