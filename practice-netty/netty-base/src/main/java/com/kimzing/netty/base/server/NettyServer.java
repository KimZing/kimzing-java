package com.kimzing.netty.base.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

import java.nio.charset.StandardCharsets;

/**
 * Netty服务端示例.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/4 16:57
 */
public class NettyServer {

    public static void main(String[] args) {
        // Boss线程，负责监听Acceptor事件，并且处理handler方法中的Handler
        EventLoopGroup parentGroup = new NioEventLoopGroup(1);
        // Worker线程，负责监听处理Read等IO事件，并且处理childHandler中的Handler中的流程
        EventLoopGroup childGroup = new NioEventLoopGroup(Runtime.getRuntime().availableProcessors() * 2);
        // Netty的启动器，接下来就配置该启动器即可
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        // 配置线程
        serverBootstrap.group(parentGroup, childGroup)
                // 指定网络通信模型
                .channel(NioServerSocketChannel.class)
                // 注册一个日志打印的Handler，parentGroup会处理该任务
                .handler(new LoggingHandler(LogLevel.INFO))
                // 注册work的Handler，这里使用ChannelInitializer，内部会包含一系列Handler,可以认为这是一个组织者
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ServerHandler());
                    }
                });

        try {
            // 这里需要使用sync()方法，这样只有当服务端运行成功后才会返回，否则直接运行到下面的代码会出问题
            ChannelFuture channelFuture = serverBootstrap.bind(8080).sync();
            // 最终代码会阻塞在这里，等待以后某个关闭操作来唤醒这里的代码。sync的作用也是同步阻塞
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            parentGroup.shutdownGracefully();
            childGroup.shutdownGracefully();
        }

    }

}

class ServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        int i = byteBuf.readableBytes();
        byte[] bytes = new byte[i];
        byteBuf.readBytes(bytes);
        System.out.println("收到客户端消息: " + new String(bytes, StandardCharsets.UTF_8));

        ByteBuf writeMessgae = ByteBufAllocator.DEFAULT.directBuffer();
        writeMessgae.writeBytes("已收到;".getBytes(StandardCharsets.UTF_8));
        ctx.writeAndFlush(writeMessgae);
    }

}
