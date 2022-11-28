package com.kimzing.netty.protobuf.client;

import com.kimzing.netty.protobuf.entity.MessageProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:07
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("开始发送消息");
        MessageProto.Message message = createMessages();
        ctx.writeAndFlush(message);
        System.out.println("消息发送成功");
    }

    private MessageProto.Message createMessages() {
        return MessageProto.Message.newBuilder().setHeader(MessageProto.Header.newBuilder().setVersion(1).build()).build();
    }
}
