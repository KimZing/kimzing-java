package com.kimzing.java.网络.proactor;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/4 10:55
 */
public class AcceptorHandler implements CompletionHandler<AsynchronousSocketChannel, Proactor> {

    @Override
    public void completed(AsynchronousSocketChannel socketChannel, Proactor proactor) {
        //每接收一个连接之后就再执行一次异步连接请求，这样就能一直处理多个连接了
        proactor.serverSocketChannel.accept(proactor, this);
        //创建新的Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        //异步读，第三个参数为接收消息回调的业务Handler
        socketChannel.read(buffer, buffer, new ReadHandler(socketChannel));
    }

    @Override
    public void failed(Throwable exc, Proactor proactor) {
        exc.printStackTrace();
        proactor.countDownLatch.countDown();
    }
}
