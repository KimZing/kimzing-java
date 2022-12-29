package com.kimzing.netty.alive.client;

import com.kimzing.netty.alive.base.entity.Header;
import com.kimzing.netty.alive.base.entity.KimMessage;
import com.kimzing.netty.alive.base.entity.User;
import com.kimzing.netty.alive.base.enums.LanguageEnum;
import com.kimzing.netty.alive.base.enums.ReqTypeEnum;
import com.kimzing.netty.alive.base.enums.SerializableEnum;
import com.kimzing.netty.alive.base.handler.AbstractHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:07
 */
public class ClientHandler extends AbstractHandler {


    private final NettyClient nettyClient;

    public ClientHandler(NettyClient nettyClient) {
        this.nettyClient = nettyClient;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("开始发送消息");
        KimMessage message = createRequest();
        ctx.writeAndFlush(message);
        System.out.println("消息发送成功");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("连接断开，重连中");
        nettyClient.connect();
        super.channelInactive(ctx);
    }

    private KimMessage createRequest() {
        Header header = new Header(1, LanguageEnum.JAVA, SerializableEnum.OBJECT, ReqTypeEnum.MESSAGE);
        User user = new User("kimzing", "kimzing@163.com", "boy");
        return new KimMessage(header, user);
    }

    @Override
    public void handleData(ChannelHandlerContext ctx, KimMessage message) {
        System.out.println("收到消息:" + message);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
        IdleState state = idleStateEvent.state();
        switch (state) {
            case WRITER_IDLE:
                handleWriterIdle(ctx);
                break;
            default:
                break;
        }
        super.userEventTriggered(ctx, evt);
    }

    protected void handleWriterIdle(ChannelHandlerContext ctx) {
        System.out.println("发送PING报文");
        Header header = new Header(1, null, null, ReqTypeEnum.PING);
        KimMessage PING = new KimMessage(header, null);
        ctx.writeAndFlush(PING);
    }

}
