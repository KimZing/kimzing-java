package com.kimzing.java.多线程.E线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 固定线程数量的线程池.
 * <p>
 *     适用于资源受限的场景
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 16:00
 */
public class FixedThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "执行中");
            });
        }
        executorService.shutdown();
    }

}
