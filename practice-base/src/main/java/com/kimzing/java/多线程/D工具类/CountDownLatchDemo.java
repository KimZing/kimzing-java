package com.kimzing.java.多线程.D工具类;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 允许一个或多个线程等待其他线程完成操作后再执行.
 *
 * <p>
 *     实现原理：基于AQS构建了一个共享锁，初始状态就是等待的个数，之后逐渐使用countDown减少锁占用，都释放完了等待线程才可以执行
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 16:06
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        Thread thread1 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(1);
            countDownLatch.countDown();
            System.out.println(2);
            countDownLatch.countDown();
        });
        Thread thread2 = new Thread(() -> {
            System.out.println(3);
            countDownLatch.countDown();
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(4);
            countDownLatch.countDown();
        });
        thread1.start();
        thread2.start();
        countDownLatch.await();
    }

}
