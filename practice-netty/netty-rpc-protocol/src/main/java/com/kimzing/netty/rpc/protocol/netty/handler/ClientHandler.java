package com.kimzing.netty.rpc.protocol.netty.handler;

import com.kimzing.netty.rpc.protocol.core.Context;
import com.kimzing.netty.rpc.protocol.core.Protocol;
import com.kimzing.netty.rpc.protocol.core.ResponseBody;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.Promise;

public class ClientHandler extends SimpleChannelInboundHandler<Protocol<ResponseBody>> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Protocol<ResponseBody> msg) throws Exception {
        long requestId = msg.getHeader().getRequestId();

        Promise<ResponseBody> promise = Context.REQUEST_MAP.remove(requestId);

        // setSuccess(msg.getContent())通过这个方法唤醒get()方法获取到服务端返回的数据
        // 数据就是通过ssetSucess方法设置的数据msg.getContent()
        promise.setSuccess(msg.getBody());

    }
}
