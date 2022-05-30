package com.kimzing.java.多线程.E线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单线程的线程池，适合保证顺序的场景.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 16:04
 */
public class SingleThreadExecutorDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "执行中");
            });
        }
        executorService.shutdown();
    }

}
