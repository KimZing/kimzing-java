package com.kimzing.netty.custom.server;

import com.kimzing.netty.custom.base.entity.KimMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:58
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        KimMessage message = (KimMessage) msg;
        System.out.println("接收到客户端对象:" + message.toString());

    }
}
