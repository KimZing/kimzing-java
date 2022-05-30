package com.kimzing.java.多线程.E线程池;

import java.util.concurrent.*;

/**
 * 线程池基本示例.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 13:51
 */
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 构建线程池
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(10, 20, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        // 执行Runnable
        threadPoolExecutor.execute(() -> System.out.println("执行Runnable"));
        // 执行带返回值的
        Future<Integer> future = threadPoolExecutor.submit(() -> {
            int i = 1;
            TimeUnit.SECONDS.sleep(2);
            return i;
        });
        Integer result = future.get();
        System.out.println(result);
        System.out.println(String.format("正在运行线程数%d, 已完成任务数%d", threadPoolExecutor.getActiveCount(), threadPoolExecutor.getCompletedTaskCount()));

        // 激活核心线程，提前初始化
        threadPoolExecutor.prestartAllCoreThreads();
        System.out.println(String.format("正在运行线程数%d， 已有线程数量%d", threadPoolExecutor.getActiveCount(), threadPoolExecutor.getPoolSize()));
        // 关闭线程池
        threadPoolExecutor.shutdown();
    }

}
