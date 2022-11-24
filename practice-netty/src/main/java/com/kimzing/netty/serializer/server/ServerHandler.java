package com.kimzing.netty.serializer.server;

import com.kimzing.netty.serializer.base.entity.KimMessage;
import com.kimzing.netty.serializer.base.handler.AbstractHandler;
import io.netty.channel.ChannelHandlerContext;

import java.util.concurrent.TimeUnit;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:58
 */
public class ServerHandler extends AbstractHandler {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // 模拟断开：当连接完成后，在第十二秒断开连接，让客户端重连
        ctx.channel().eventLoop().schedule(() -> {
            System.out.println("已模拟断开连接");
            ctx.close();
        }, 12, TimeUnit.SECONDS);
        super.channelActive(ctx);
    }

    @Override
    public void handleData(ChannelHandlerContext ctx, KimMessage message) {
        System.out.println("接收到客户端对象:" + message.toString());
    }

}
