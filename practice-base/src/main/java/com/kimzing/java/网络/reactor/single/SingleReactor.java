package com.kimzing.java.网络.reactor.single;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Reactor入口.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 10:52
 */
public class SingleReactor implements Runnable {

    private Selector selector;
    private ServerSocketChannel serverSocketChannel;

    public SingleReactor() throws IOException {
        this.selector = Selector.open();
        this.serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(8080));
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT, new SingleAcceptor(selector, serverSocketChannel));
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while (iterator.hasNext()) {
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
        Runnable runnable = (Runnable) key.attachment();
        if (runnable != null) {
            runnable.run();
        }
    }

}
