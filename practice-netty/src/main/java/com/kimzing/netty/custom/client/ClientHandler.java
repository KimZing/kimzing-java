package com.kimzing.netty.custom.client;

import com.kimzing.netty.custom.base.entity.*;
import com.kimzing.netty.custom.base.enums.LanguageEnum;
import com.kimzing.netty.custom.base.enums.ReqTypeEnum;
import com.kimzing.netty.custom.base.enums.SerializableEnum;
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
        KimMessage message = createRequest();
        ctx.writeAndFlush(message);
        System.out.println("消息发送成功");
    }

    private KimMessage createRequest() {
        Header header = new Header(1, LanguageEnum.JAVA, SerializableEnum.OBJECT, ReqTypeEnum.MESSAGE);
        User user = new User("kimzing", "kimzing@163.com", "boy");
        return new KimMessage(header, user);
    }
}
