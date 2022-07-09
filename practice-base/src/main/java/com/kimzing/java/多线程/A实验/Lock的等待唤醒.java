package com.kimzing.java.多线程.A实验;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/7 17:48
 */
public class Lock的等待唤醒 {


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("wait thread start");
                condition.await();
                System.out.println("wait thread end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("signal thread start");
                condition.signal();
                System.out.println("signal thread end");
            } finally {
                lock.unlock();
            }
        }).start();
    }

}
