package com.kimzing.java.多线程.A示例.连接池;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 通过多线程获取数据库连接池中的连接.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/18 16:26
 */
public class ConnectionPool {
    /**
     * 存放连接的双向队列
     */
    private LinkedList<Connection> pool = new LinkedList<>();

    /**
     * 测试场景
     * 测试多个线程同时去获取n次的数据连接，获取到则进行记录并执行，获取不到则记录次数，最终查看结果
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // 启动的线程数，随着线程数增加，会有越来越多线程无法拿到connection实例
        int threadCount = 50;
        // 每个线程获取连接的次数
        int count = 20;
        AtomicInteger gotNum = new AtomicInteger(0);
        AtomicInteger notGotNum = new AtomicInteger(0);
        // 线程启动统一等待
        CountDownLatch start = new CountDownLatch(1);
        // 主线程等待
        CountDownLatch end = new CountDownLatch(threadCount);
        ConnectionPool pools = new ConnectionPool(10);
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new Client(pools, count, gotNum, notGotNum, start, end), "client-" + (i + 1));
            thread.start();
        }
        // 睡眠一秒，确保所有线程都准备就绪
        TimeUnit.SECONDS.sleep(1);
        start.countDown();
        end.await();
        System.out.println(String.format("总次数:%d,获取连接数:%d,未获取连接数:%d", threadCount * count, gotNum.get(), notGotNum.get()));
    }

    public ConnectionPool(int initialSize) {
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
     *
     * @param connection
     */
    public void releaseConnection(Connection connection) {
        if (connection == null) {
            return;
        }
        synchronized (pool) {
            // 1. 将连接重新放入连接池
            pool.addLast(connection);
            // 2. 唤醒等待获取连接的线程
            pool.notifyAll();
        }
    }

    /**
     * 获取连接池中的连接
     * <p>
     * 其实可以将millionseconds进行统一
     * </p>
     *
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
                Connection connection = null;
                if (!pool.isEmpty()) {
                    connection = pool.removeFirst();
                }
                // pollFirst弹出第一个元素，如果没有返回null
                return connection;
            }
        }
    }

    class Connection {
        private int index;

        public Connection(int index) {
            this.index = index;
        }

        /**
         * 模拟提交过程
         */
        public void submit() {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Client implements Runnable {

        private ConnectionPool pools;
        private int count;
        private AtomicInteger gotNum;
        private AtomicInteger notGotNum;
        private CountDownLatch start;
        private CountDownLatch end;

        public Client(ConnectionPool pools, int count, AtomicInteger gotNum, AtomicInteger notGotNum, CountDownLatch start, CountDownLatch end) {
            this.pools = pools;
            this.count = count;
            this.gotNum = gotNum;
            this.notGotNum = notGotNum;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            try {
                start.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (int i = 0; i < count; i++) {
                Connection connection = null;
                try {
                    // 尝试将其改为0，那么将会一直等待知道获得连接
                    connection = pools.fetchConnection(1000);
                    if (connection != null) {
                        System.out.println(Thread.currentThread().getName() + "获得连接" + connection.index);
                        connection.submit();
                        gotNum.incrementAndGet();
                    } else {
                        System.out.println(Thread.currentThread().getName() + "未获得连接");
                        notGotNum.incrementAndGet();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    pools.releaseConnection(connection);
                }
            }
            end.countDown();
        }
    }
}
