package com.kimzing.java.多线程.D工具类;

import java.util.concurrent.Semaphore;

/**
 * 信号量，控制通过的线程，类似令牌桶一样.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 17:38
 */
public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10);

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "获得了信号");
                    Thread.sleep(20);
                    System.out.println(Thread.currentThread().getName() + "当前剩余:" + semaphore.availablePermits());
                    semaphore.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "Thread-" + i).start();
        }
    }

}
