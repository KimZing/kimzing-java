package com.kimzing.netty.protobuf.server;

import com.kimzing.netty.protobuf.entity.MessageProto;
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
        MessageProto.Message message = (MessageProto.Message) msg;
        System.out.println("接收到客户端对象:" + message.toString());

    }
}
