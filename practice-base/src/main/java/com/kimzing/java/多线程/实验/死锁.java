package com.kimzing.java.多线程.实验;

import lombok.extern.java.Log;

import java.util.concurrent.TimeUnit;

/**
 * 死锁的演示.
 *
 * <p>
 *     启动两个线程，线程1获取A锁，睡眠10s，再获取B锁。线程2获取B锁，睡眠10s中，再获取A锁。
 *     锁同时只能被一个线程持有，所以两个线程相互等待，就会形成死锁。
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/1/20 14:25
 */
@Log
public class 死锁 {

    private static String A = "A";

    private static String B = "B";

    public static void main(String[] args) {
        startThread1();
        startThread2();
    }

    private static void startThread1() {
        new Thread(() -> {
            synchronized(A) {
                log.info(Thread.currentThread().getName() + "获取A锁");
                try {
                    TimeUnit.MINUTES.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(B) {
                    log.info(Thread.currentThread().getName() + "获取B锁");
                }
            }
        }, "线程1").start();
    }

    private static void startThread2() {
        new Thread(() -> {
            synchronized(B) {
                log.info(Thread.currentThread().getName() + "获取B锁");
                try {
                    TimeUnit.MINUTES.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(A) {
                    log.info(Thread.currentThread().getName() + "获取A锁");
                }
            }
        }, "线程2").start();
    }

}
