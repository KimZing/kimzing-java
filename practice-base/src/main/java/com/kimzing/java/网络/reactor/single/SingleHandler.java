package com.kimzing.java.网络.reactor.single;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 11:09
 */
public class SingleHandler implements Runnable {

    private SocketChannel socketChannel;

    public SingleHandler(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    @Override
    public void run() {
        try {
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            socketChannel.read(byteBuffer);
            System.out.println("收到客户端数据：" + new String(byteBuffer.array(), StandardCharsets.UTF_8));
            socketChannel.write(ByteBuffer.wrap("ok".getBytes(StandardCharsets.UTF_8)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
