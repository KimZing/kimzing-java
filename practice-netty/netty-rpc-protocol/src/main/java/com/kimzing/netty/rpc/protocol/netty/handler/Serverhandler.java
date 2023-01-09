package com.kimzing.netty.rpc.protocol.netty.handler;

import com.kimzing.netty.rpc.protocol.core.*;
import com.kimzing.netty.rpc.protocol.spring.service.Mediator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class Serverhandler extends SimpleChannelInboundHandler<Protocol<RequestBody>> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Protocol<RequestBody> msg) throws Exception {

        Protocol<ResponseBody> resProtocal = new Protocol<>();
        Header header = msg.getHeader();
        header.setReqType((byte) 2);
        // 这里就是调用server方法的地方
        Object result = Mediator.getInstance().processor(msg.getBody());
        resProtocal.setHeader(header);
        ResponseBody rpcResponseBody = new ResponseBody();
        rpcResponseBody.setMsg("success");
        rpcResponseBody.setData(result);
        resProtocal.setBody(rpcResponseBody);
        ctx.writeAndFlush(resProtocal);

    }
}
