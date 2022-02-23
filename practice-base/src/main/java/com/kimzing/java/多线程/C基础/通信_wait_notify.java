package com.kimzing.java.多线程.C基础;

import java.util.concurrent.TimeUnit;

/**
 * 线程等待通知.
 * <p>
 *     启动两个线程A和B，A线程启动后进入睡眠状态，B线程启动后唤醒睡眠的线程,同时B再次尝试获取锁。
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/16 17:51
 */
public class 通信_wait_notify {

    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " is running");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completed");
            }
        }, "Thread-A");
        threadA.start();
        TimeUnit.MILLISECONDS.sleep(10);

        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " is running");
                lock.notifyAll();
                System.out.println(Thread.currentThread().getName() + " is notify");
                // 此处睡眠是为了稍后A与B同时竞争锁，否则B再次拿到锁的概率非常大。
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // B 再次获取锁时为了说明在等待队列里的线程都有机会再次获取锁
            synchronized(lock) {
                System.out.println(Thread.currentThread().getName() + " lock again");
            }
        }, "Thread-B");
        threadB.start();
    }

}
