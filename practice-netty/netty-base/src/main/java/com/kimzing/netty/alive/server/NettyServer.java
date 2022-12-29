package com.kimzing.netty.alive.server;

import com.kimzing.netty.alive.base.code.KimMessageDecoder;
import com.kimzing.netty.alive.base.code.KimMessageEncoder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:54
 */
public class NettyServer {

    public static void main(String[] args) {
        EventLoopGroup parent = new NioEventLoopGroup();
        EventLoopGroup child = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap()
                .group(parent, child)
                .channel(NioServerSocketChannel.class)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline()
                                .addLast(new KimMessageEncoder())
                                .addLast(new KimMessageDecoder())
                                .addLast(new ServerHandler());
                    }
                });
        try {
            ChannelFuture channelFuture = bootstrap.bind(8080).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            parent.shutdownGracefully();
            child.shutdownGracefully();
        }
    }

}
