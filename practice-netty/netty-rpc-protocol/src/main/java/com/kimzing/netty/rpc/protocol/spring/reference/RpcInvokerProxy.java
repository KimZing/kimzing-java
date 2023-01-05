package com.kimzing.netty.rpc.protocol.spring.reference;

import com.kimzing.netty.rpc.protocol.constant.RpcConstant;
import com.kimzing.netty.rpc.protocol.core.*;
import com.kimzing.netty.rpc.protocol.netty.NettyClient;
import io.netty.channel.DefaultEventLoop;
import io.netty.util.concurrent.DefaultPromise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RpcInvokerProxy implements InvocationHandler {

    private String host;

    private int port;

    public RpcInvokerProxy(String serviceAddress, int servicePort) {
        this.host = serviceAddress;
        this.port = servicePort;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 建立连接，并且发送报文
        RpcProtocal<RpcRequest> rpcProtocal = new RpcProtocal<>();

        long requestId = RequestHolder.REQUEST_ID.incrementAndGet();
        Header header = new Header(RpcConstant.MAGIC, SerialType.JSON_SERIAL.code(),ReqType.REQUEST.code(),requestId,0);
        rpcProtocal.setHeader(header);

        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        rpcRequest.setParameterTypes(method.getParameterTypes());
        rpcRequest.setParams(args);
        rpcProtocal.setContent(rpcRequest);

        // 发送数据到服务端
        NettyClient nettyClient = new NettyClient(host,port);
        RpcFuture<RpcResponse> future=new RpcFuture<>(new DefaultPromise<RpcResponse>(new DefaultEventLoop()));
        RequestHolder.REQUEST_MAP.put(requestId,future);
        nettyClient.sendRequest(rpcProtocal);

        // 获取返回结果
        return future.getPromise().get().getData();
    }
}
