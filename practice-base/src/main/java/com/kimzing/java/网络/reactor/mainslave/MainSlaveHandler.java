package com.kimzing.java.网络.reactor.mainslave;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 18:24
 */
public class MainSlaveHandler implements Runnable {

    @SuppressWarnings("AlibabaThreadPoolCreation")
    private Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private final SocketChannel socketChannel;

    public MainSlaveHandler(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    @Override
    public void run() {
        // 这个地方很有意思，当使用多线程时，多线程里面还没有将数据读取完，而主线程执行的外层的循环又进入了下一次的select，这时select仍会认为是有数据没读完的，然后再次触发read
        // 随后又使用一个线程来执行，这个线程还没读取完，select又进入了下一次执行，最终导致的现象就是又很多线程执行读数据，但其中只有一个读到了其他的线程都读不到了。
        executor.execute(() -> {
            try {
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                int read = socketChannel.read(byteBuffer);
                if (read == -1) {
                    System.out.println("连接已经关闭");
                    socketChannel.close();
                    return;
                }
                System.out.println("收到客户端消息:" + new String(byteBuffer.array()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        // 而这个睡眠代码，会让外层主线程休眠，这时子线程就确保能执行完了，下次再select就没有对应事件了。
        // 这里睡眠肯定是不应该的，具体应该如何解决之后再看看方案
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
