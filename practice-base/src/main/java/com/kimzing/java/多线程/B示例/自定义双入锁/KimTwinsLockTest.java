package com.kimzing.java.多线程.B示例.自定义双入锁;

import java.util.concurrent.TimeUnit;

/**
 * 双入锁测试.
 *
 * <p>
 *     有四个线程去获取锁，同一时刻有且仅有两个线程能获得锁
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/4/29 17:27
 */
public class KimTwinsLockTest {


    public static void main(String[] args) {
        KimTwinsLock lock = new KimTwinsLock();
        Runnable runner = () -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "获得了锁");
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println(Thread.currentThread().getName() + "释放了锁");
                lock.unlock();
            }

        };
        Thread thread1 = new Thread(runner, "thread1");
        Thread thread2 = new Thread(runner, "thread2");
        Thread thread3 = new Thread(runner, "thread3");
        Thread thread4 = new Thread(runner, "thread4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
