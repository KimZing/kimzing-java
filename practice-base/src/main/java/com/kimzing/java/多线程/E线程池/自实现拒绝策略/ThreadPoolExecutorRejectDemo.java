package com.kimzing.java.多线程.E线程池.自实现拒绝策略;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 16:37
 */
public class ThreadPoolExecutorRejectDemo {
    public static void main(String[] args) {
        // 两个线程，一个队列，只会有三个任务执行成功
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 100,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(1), new KimRejectPolicy());
        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "正在执行中");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        threadPoolExecutor.shutdown();
    }
}

class KimRejectPolicy implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("已经拒绝该任务");
    }
}
