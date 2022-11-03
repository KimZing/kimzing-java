package com.kimzing.java.网络.reactor.multi;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 13:24
 */
public class MultiAcceptor implements Runnable{
    private final Selector selector;
    private final ServerSocketChannel serverSocketChannel;

    public MultiAcceptor(Selector selector, ServerSocketChannel serverSocketChannel) {
        this.selector = selector;
        this.serverSocketChannel = serverSocketChannel;
    }


    @Override
    public void run() {
        try {
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(selector, SelectionKey.OP_READ, new MultiHandler(socketChannel));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
