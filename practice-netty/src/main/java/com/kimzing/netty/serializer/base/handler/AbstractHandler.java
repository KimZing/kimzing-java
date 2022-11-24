package com.kimzing.netty.serializer.base.handler;

import com.kimzing.netty.serializer.base.entity.Header;
import com.kimzing.netty.serializer.base.entity.KimMessage;
import com.kimzing.netty.serializer.base.enums.ReqTypeEnum;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/23 14:03
 */
public abstract class AbstractHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        KimMessage message = (KimMessage) msg;
        ReqTypeEnum reqType = message.getHeader().getReqType();
        switch (reqType) {
            case MESSAGE:
                handleData(ctx, message);
                break;
            case PING:
                handlePING(ctx);
                break;
            case PONG:
                handlePONG(ctx);
                break;
            default:
                break;
        }
        super.channelRead(ctx, msg);
    }

    private void handlePONG(ChannelHandlerContext ctx) {
        System.out.println("收到PONG消息:" + ctx.channel().remoteAddress());
    }

    /**
     * 返回PONG消息
     * */
    private void handlePING(ChannelHandlerContext ctx) {
        System.out.println("收到PING消息:" + ctx.channel().remoteAddress());
        Header header = new Header(1, null, null, ReqTypeEnum.PONG);
        KimMessage PONG = new KimMessage(header, null);
        ctx.writeAndFlush(PONG);
    }

    public abstract void handleData(ChannelHandlerContext ctx, KimMessage message);
}
