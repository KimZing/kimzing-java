package com.kimzing.netty.alive.client;

import com.kimzing.netty.alive.base.code.KimMessageDecoder;
import com.kimzing.netty.alive.base.code.KimMessageEncoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:04
 */
public class NettyClient {

    EventLoopGroup worker;
    Bootstrap bootstrap;
    Channel channel;

    public static void main(String[] args) {
        NettyClient nettyClient = new NettyClient();
        nettyClient.start();
    }

    public void start() {
        worker = new NioEventLoopGroup();
        bootstrap = new Bootstrap()
                .group(worker)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline()
                                .addLast(new IdleStateHandler(0, 5, 0))
                                .addLast(new KimMessageDecoder())
                                .addLast(new KimMessageEncoder())
                                .addLast(new ClientHandler(NettyClient.this));
                    }
                });
        connect();
    }

    protected void connect() {
        if (channel != null && channel.isActive()) {
            return;
        }
        try {
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8080)
                    .addListener(new ChannelFutureListener() {
                        @Override
                        public void operationComplete(ChannelFuture future) throws Exception {
                            if (future.isSuccess()) {
                                System.out.println("连接成功");
                                channel = future.channel();
                                return;
                            }
                            future.channel().eventLoop().schedule(() -> {
                                System.out.println("正在重连");
                                connect();
                            }, 2, TimeUnit.SECONDS);
                        }
                    }).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 不能关闭，关闭之后重连的定时调度会失效
            // worker.shutdownGracefully();
        }
    }

}
