package com.kimzing.java.多线程.B示例.线程池;

import java.util.concurrent.*;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/12 11:04
 */
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10,
                10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
        // 预初始化所有核心线程
        pool.prestartAllCoreThreads();
        // 允许核心线程销毁
        pool.allowCoreThreadTimeOut(true);
        // 执行任务，无返回值
        pool.execute(() -> {
            System.out.println(123);
        });
        // 执行任务，有返回值
        Future<String> result = pool.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return "SUCCESS";
        });
        System.out.println(result.get());

        pool.shutdown();
        pool.shutdownNow();
    }

}
