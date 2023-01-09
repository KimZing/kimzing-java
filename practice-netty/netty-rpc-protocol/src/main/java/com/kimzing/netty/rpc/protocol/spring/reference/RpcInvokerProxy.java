package com.kimzing.netty.rpc.protocol.spring.reference;

import com.kimzing.netty.rpc.protocol.core.*;
import com.kimzing.netty.rpc.protocol.netty.NettyClient;
import io.netty.channel.DefaultEventLoop;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.Promise;

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
        Protocol<RequestBody> protocol = new Protocol<>();

        long requestId = Context.REQUEST_ID.incrementAndGet();
        Header header = new Header((byte) 1, (byte) 1, requestId, 0);
        protocol.setHeader(header);

        RequestBody requestBody = new RequestBody();
        requestBody.setClassName(method.getDeclaringClass().getName());
        requestBody.setMethodName(method.getName());
        requestBody.setParameterTypes(method.getParameterTypes());
        requestBody.setParams(args);
        protocol.setBody(requestBody);

        // 发送数据到服务端
        NettyClient nettyClient = new NettyClient(host, port);
        Promise<ResponseBody> promise = new DefaultPromise<ResponseBody>(new DefaultEventLoop());
        Context.REQUEST_MAP.put(requestId, promise);
        nettyClient.sendRequest(protocol);

        // 获取返回结果
        return promise.get().getData();
    }
}
