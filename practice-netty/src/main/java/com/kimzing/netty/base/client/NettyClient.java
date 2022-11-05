package com.kimzing.netty.base.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.nio.charset.StandardCharsets;

/**
 * Netty客户端示例.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/4 16:57
 */
public class NettyClient {

    public static void main(String[] args) {
        NioEventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {

                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ClientHandler());
                    }
                });
        try {
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8080);
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            group.shutdownGracefully();
        }
    }

}

class ClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接成功");

        for (int i = 0; i < 10; i++) {
            ByteBuf byteBuf = ByteBufAllocator.DEFAULT.directBuffer();
            byteBuf.writeBytes(("第" + i + "条消息-").getBytes(StandardCharsets.UTF_8));
            ctx.writeAndFlush(byteBuf);
        }
        super.channelActive(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf message = (ByteBuf) msg;
        int i = message.readableBytes();
        byte[] bytes = new byte[i];
        message.readBytes(bytes);
        System.out.println("服务端消息:" + new String(bytes, StandardCharsets.UTF_8));
    }
}