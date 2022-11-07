package com.kimzing.netty.onedecode.delimiterbased;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;

import java.nio.charset.StandardCharsets;

/**
 * 指定分隔符.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/7 13:39
 */
public class DelimiterBasedServer {

    public static void main(String[] args) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(new NioEventLoopGroup(), new NioEventLoopGroup(Runtime.getRuntime().availableProcessors()))
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {

                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new DelimiterBasedFrameDecoder(9999, true, true,
                                ByteBufAllocator.DEFAULT.directBuffer().writeBytes("$client$".getBytes(StandardCharsets.UTF_8))));
                        ch.pipeline().addLast(new SimpleServerHandler());
                    }
                });
        try {
            ChannelFuture channelFuture = serverBootstrap.bind(8080).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class SimpleServerHandler extends ChannelInboundHandlerAdapter {

        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            ByteBuf message = (ByteBuf) msg;
            byte[] bytes = new byte[message.readableBytes()];
            message.readBytes(bytes);
            System.out.println("收到客户端消息:" + new String(bytes, StandardCharsets.UTF_8));
            super.channelRead(ctx, msg);

            ctx.writeAndFlush(ByteBufAllocator.DEFAULT.directBuffer().writeBytes("收到$server$".getBytes(StandardCharsets.UTF_8)));
        }
    }
}
