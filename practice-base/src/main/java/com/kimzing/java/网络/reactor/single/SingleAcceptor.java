package com.kimzing.java.网络.reactor.single;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * 连接处理器.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 11:02
 */
public class SingleAcceptor implements Runnable {

    private Selector selector;
    private ServerSocketChannel serverSocketChannel;

    public SingleAcceptor(Selector selector, ServerSocketChannel serverSocketChannel) {
        this.selector = selector;
        this.serverSocketChannel = serverSocketChannel;
    }

    @Override
    public void run() {
        try {
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(selector, SelectionKey.OP_READ, new SingleHandler(socketChannel));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
