package com.kimzing.java.网络.reactor.mainslave;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 16:33
 */
public class MainSlaveAcceptor implements Runnable {

    private ServerSocketChannel serverSocketChannel;

    private Integer count = Runtime.getRuntime().availableProcessors();
    private Selector[] selectors = new Selector[count];
    private Thread[] threads = new Thread[count];
    private MainSlaveSubReactor[] subReactors = new MainSlaveSubReactor[count];

    /**
     * 初始化多个SubReactor
     * 初始化多个selector
     * 每个SubReactor都有一个selector
     * 创建线程组包装SubReactor 启动线程,也就是调用每一个SubReactor的run方法
     * @param serverSocketChannel
     */
    public MainSlaveAcceptor(ServerSocketChannel serverSocketChannel) throws IOException {
        this.serverSocketChannel = serverSocketChannel;
        // 初始化子Reactor (Selector)
        for (Integer i = 0; i < count; i++) {
            selectors[i] = Selector.open();
            subReactors[i] = new MainSlaveSubReactor(selectors[i]);
            threads[i] = new Thread(subReactors[i]);
            threads[i].start();
        }
    }

    private int index = 0;

    @Override
    public void run() {
        try {
            System.out.println("接收到客户端连接");
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(false);

            // MARK 这里感觉也比较奇葩，唤醒该线程，但如果执行的足够快，那么会直接进入下一次的阻塞，导致下面的事件注册还是注册不了，
            // 在select()阻塞方法的下面睡眠一会就一切正常了，netty当中使用了队列来达到一样的效果
            selectors[index].wakeup();

            System.out.println("开始注册读事件-" + index);
            socketChannel.register(selectors[index], SelectionKey.OP_READ, new MainSlaveHandler(socketChannel));
            System.out.println("成功注册读事件" + index);

            if (++index == selectors.length) {
                index = 0;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
