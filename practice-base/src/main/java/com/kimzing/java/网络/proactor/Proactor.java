package com.kimzing.java.网络.proactor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.CountDownLatch;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/4 10:46
 */
public class Proactor implements Runnable {

    public AsynchronousServerSocketChannel serverSocketChannel;

    public Proactor() {
        try {
            serverSocketChannel = AsynchronousServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8080));
            System.out.println("服务端已启动");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public CountDownLatch countDownLatch = new CountDownLatch(1);
    @Override
    public void run() {
        serverSocketChannel.accept(this, new AcceptorHandler());
        try {
            // 因为是异步的，服务刚启动，可能线程就结束了，所以这里需要阻塞，当服务关闭的时候再释放该线程
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
