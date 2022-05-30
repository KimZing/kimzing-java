package com.kimzing.java.多线程.E线程池;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 演示带优先级的任务.
 * <p>
 * 模拟一个只有一个线程的线程池，向其中添加不同优先级的任务，观察不同优先级任务的执行情况
 * 为了确定优先级搞的线程先执行，可以让每个任务睡眠一会，以确保任务都被添加了。
 * 为了进一步验证，可以将线程数调整为2，确保确实是多线程下都可以按照优先级执行
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 13:51
 */
public class ThreadPoolExecutorPriorityDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 构建线程池
        ThreadPoolExecutor threadPoolExecutor =
                // new ThreadPoolExecutor(1, 1, 100, TimeUnit.MILLISECONDS,
                new ThreadPoolExecutor(2, 2, 100, TimeUnit.MILLISECONDS,
                        new PriorityBlockingQueue<>(100));

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1);
            System.out.println("已经添加任务" + i + "，优先级为" + i % 5);
            threadPoolExecutor.execute(new Work(i, i % 5));
        }

        // 关闭线程池
        threadPoolExecutor.shutdown();
    }

}

class Work implements Runnable, Comparable<Work> {

    private int priority;

    private int index;

    public Work(int index, int priority) {
        this.priority = priority;
        this.index = index;
    }

    @Override
    @SneakyThrows
    public void run() {
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("thread is " + Thread.currentThread().getName() + " index is " + index + " prioriy is " + priority);
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Work work) {
        return this.priority - work.getPriority();
    }
}