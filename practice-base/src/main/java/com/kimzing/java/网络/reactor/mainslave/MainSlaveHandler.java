package com.kimzing.java.网络.reactor.mainslave;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 18:24
 */
public class MainSlaveHandler implements Runnable {
    private final SocketChannel socketChannel;

    public MainSlaveHandler(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    @Override
    public void run() {
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
    }
}
