package com.kimzing.java.多线程.A实验;

import java.util.concurrent.TimeUnit;

/**
 * 测试线程的状态.
 * <p>
 *
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/15 16:00
 */
public class 线程六种状态 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
            }
        }, "thread-1-runnable");
        // NEW状态,还没有调用start方法
        System.out.println(thread1.getState());
        thread1.start();

        // RUNNABLE状态,已经调用start方法，准备就绪或正在运行
        System.out.println(thread1.getState());

        // BlOCKED状态，两个线程，其中一个线程先启动获得锁，随后100ms启动第二个线程，获取不到锁，就会是BLOCKED状态
        new Thread(() -> block()).start();
        TimeUnit.MILLISECONDS.sleep(10);
        Thread thread2 = new Thread(() -> block(), "thread-2-blocked");
        thread2.start();
        // 必须睡眠，如果直接打印状态，线程刚就绪还没有执行到获取锁
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(thread2.getState());

        // WAITING：等待其他线程结束
        Thread thread3 = new Thread(() -> {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread-3-wating");
        thread3.start();
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(thread3.getState());

        // TIME_WAITING: 有时间限制即可
        Thread thread4 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread-4-time-waiting");
        thread4.start();
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(thread4.getState());

        // TERMINATED: 终止
        Thread thread5 = new Thread(() -> {}, "thread-5-terminated");
        thread5.start();
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(thread5.getState());
    }

    public static synchronized void block() {
        while (true) {
        }
    }

}
