package com.kimzing.java.多线程.A示例;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 通过多线程获取数据库连接池中的连接.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/18 16:26
 */
public class 连接池 {
    // 存放连接的容器
    private LinkedList<Connection> pool = new LinkedList<>();
    private static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        连接池 pool = new 连接池(1);
        Thread runner1 = new Thread(() -> {
            try {
                latch.await();
                System.out.println(Thread.currentThread().getName() + ":" + pool.fetchConnection(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "runner1");
        Thread runner2 = new Thread(() -> {
            try {
                latch.await();
                System.out.println(Thread.currentThread().getName() + ":" + pool.fetchConnection(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "runner2");
        runner1.start();
        runner2.start();
        // 睡眠一会  确保两个线程都准备就绪
        TimeUnit.MILLISECONDS.sleep(100);
        latch.countDown();
    }

    public 连接池(int initialSize) {
        // 设置默认的初始化连接数量
        if (initialSize <= 0) {
            initialSize = 5;
        }
        for (int i = 0; i < initialSize; i++) {
            pool.add(new Connection(i));
        }
    }

    /**
     * 释放连接
     * @param connection
     */
    public void releaseConnection(Connection connection) {
        if (connection == null) {
            return;
        }
        synchronized(pool) {
            // 1. 将连接重新放入连接池
            pool.addLast(connection);
            // 2. 唤醒等待获取连接的线程
            pool.notifyAll();
        }
    }

    /**
     * 获取连接池中的连接
     * <p>
     *     其实可以将millionseconds进行统一
     * </p>
     * @param milliseconds 获取连接的超时时间
     * @return
     */
    public Connection fetchConnection(long milliseconds) throws InterruptedException {
            synchronized (pool) {
            // 无超时等待
            if (milliseconds <= 0) {
                while (pool.isEmpty()) {
                    pool.wait();
                }
                // removeFirst会返回第一个元素 如果为空，则抛异常。注意和pollFirst对比
                return pool.removeFirst();
            // 有超时等待
            } else {
                // 等待到期时间
                long future = System.currentTimeMillis() + milliseconds;
                // 剩余等待时间
                long remaining = milliseconds;
                // 如果连接池为空 并且 剩余等待时间大于0，则继续等待
                while (pool.isEmpty() && remaining > 0) {
                    pool.wait(remaining);
                    // 重新计算等待时间
                    remaining = future - System.currentTimeMillis();
                }
                // pollFirst弹出第一个元素，如果没有返回null
                return pool.pollFirst();
            }
        }
    }

    class Connection {
        private int index;

        public Connection(int index) {
            this.index = index;
        }
    }
}
