package com.kimzing.java.多线程.E线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 根据需要创建线程.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 16:08
 */
public class CachedThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 根据情况创建不定数量的线程
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }

}
