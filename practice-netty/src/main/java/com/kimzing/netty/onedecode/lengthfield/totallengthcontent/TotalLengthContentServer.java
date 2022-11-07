package com.kimzing.netty.onedecode.lengthfield.totallengthcontent;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/**
 * @author KimZing - kimzing@163.com
 * @since 2022/11/7 13:39
 */
public class TotalLengthContentServer {

    public static void main(String[] args) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(new NioEventLoopGroup(), new NioEventLoopGroup(Runtime.getRuntime().availableProcessors()))
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {

                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline()
                                // 解析长度并提取内容 (大端序，长度为最大值，第一位就是长度信息,长度共4个字节，补偿值为0，跳过4个长度信息， 快速失败)
                                .addLast(new LengthFieldBasedFrameDecoder(ByteOrder.BIG_ENDIAN, Integer.MAX_VALUE,
                                        0, 4, -4, 4, false))
                                .addLast(new SimpleServerHandler());
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
        }
    }
}
