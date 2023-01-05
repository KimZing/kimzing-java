package com.kimzing.netty.rpc.protocol.netty.handler;

import com.kimzing.netty.rpc.protocol.core.RequestHolder;
import com.kimzing.netty.rpc.protocol.core.RpcFuture;
import com.kimzing.netty.rpc.protocol.core.RpcProtocal;
import com.kimzing.netty.rpc.protocol.core.RpcResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientHandler extends SimpleChannelInboundHandler<RpcProtocal<RpcResponse>> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RpcProtocal<RpcResponse> msg) throws Exception {
        long requestId = msg.getHeader().getRequestId();

        RpcFuture<RpcResponse> future = RequestHolder.REQUEST_MAP.remove(requestId);

        // setSuccess(msg.getContent())通过这个方法唤醒get()方法获取到服务端返回的数据
        // 数据就是通过ssetSucess方法设置的数据msg.getContent()
        future.getPromise().setSuccess(msg.getContent());

    }
}
