package com.kimzing.netty.onedecode.fixedlength;

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
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.logging.LoggingHandler;

import java.nio.charset.StandardCharsets;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/6 19:27
 */
public class FixedLengthServer {

    public static void main(String[] args) {
        NioEventLoopGroup parent = new NioEventLoopGroup();
        NioEventLoopGroup child = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(parent, child)
                .channel(NioServerSocketChannel.class)
                .handler(new LoggingHandler())
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new FixedLengthFrameDecoder(8));
                        ch.pipeline().addLast(new SimpleServerHandler());
                    }
                });
        try {
            ChannelFuture future = bootstrap.bind(8080).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            parent.shutdownGracefully();
            child.shutdownGracefully();
        }
    }

    private static class SimpleServerHandler extends ChannelInboundHandlerAdapter {
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            ByteBuf byteBuf = (ByteBuf) msg;
            int length = byteBuf.readableBytes();
            byte[] bytes = new byte[length];
            byteBuf.readBytes(bytes);
            System.out.println("收到客户端消息:" + new String(bytes, StandardCharsets.UTF_8));
            super.channelRead(ctx, msg);

            ByteBuf message = ByteBufAllocator.DEFAULT.directBuffer();
            message.writeBytes("已收到;".getBytes(StandardCharsets.UTF_8));
            ctx.writeAndFlush(message);
        }
    }
}
