package com.kimzing.netty.onedecode.delimiterbased;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;

import java.nio.charset.StandardCharsets;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/7 13:40
 */
public class DelimiterBasedClient {

    public static void main(String[] args) {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(new NioEventLoopGroup())
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new DelimiterBasedFrameDecoder(9999, true, true,
                                ByteBufAllocator.DEFAULT.directBuffer().writeBytes("$server$".getBytes(StandardCharsets.UTF_8))));
                        ch.pipeline().addLast(new SimpleClientHandler());
                    }
                });
        try {
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8080).sync();
            channelFuture.channel().closeFuture();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class SimpleClientHandler extends ChannelInboundHandlerAdapter {

        @Override
        public void channelActive(ChannelHandlerContext ctx) throws Exception {
            for (int i = 0; i < 10; i++) {
                ctx.writeAndFlush(ByteBufAllocator.DEFAULT.directBuffer().writeBytes(("第" + i +"条$client$").getBytes(StandardCharsets.UTF_8)));
            }
            super.channelActive(ctx);
        }

        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            ByteBuf message = (ByteBuf) msg;
            byte[] bytes = new byte[message.readableBytes()];
            message.readBytes(bytes);
            System.out.println("收到服务端消息:" + new String(bytes, StandardCharsets.UTF_8));
            super.channelRead(ctx, msg);
        }
    }
}
