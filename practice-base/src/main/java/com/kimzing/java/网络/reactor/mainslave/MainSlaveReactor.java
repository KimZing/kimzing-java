package com.kimzing.java.网络.reactor.mainslave;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 16:31
 */
public class MainSlaveReactor implements Runnable {

    private Selector selector;
    private ServerSocketChannel serverSocketChannel;

    public MainSlaveReactor() throws IOException {
        selector = Selector.open();
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(8080));
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT, new MainSlaveAcceptor(serverSocketChannel));
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while(iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    dispatch(key);
                    iterator.remove();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void dispatch(SelectionKey key) {
        // 这里应该只会有Acceptor
        Runnable runnable = (Runnable) key.attachment();
        if (runnable != null) {
            runnable.run();
        }
    }
}
