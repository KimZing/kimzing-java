package com.kimzing.java.网络.reactor.multi;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 13:26
 */
public class MultiHandler implements Runnable {
    private final SocketChannel socketChannel;

    @SuppressWarnings("AlibabaThreadPoolCreation")
    private final static Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public MultiHandler(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    @Override
    public void run() {
        System.out.println("触发");
        executor.execute(new ReaderHandler(socketChannel));
    }

    private class ReaderHandler implements Runnable {
        private final SocketChannel socketChannel;

        public ReaderHandler(SocketChannel socketChannel) {
            this.socketChannel = socketChannel;
        }

        @Override
        public void run() {
            try {
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                int read = socketChannel.read(byteBuffer);
                if (read == -1) {
                    System.out.println("已经关闭");
                    socketChannel.close();
                }
                System.out.println(Thread.currentThread().getName() + "-接收到客户端请求:" + new String(byteBuffer.array()));
                socketChannel.write(ByteBuffer.wrap("ok".getBytes()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
