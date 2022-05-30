package com.kimzing.java.多线程.E线程池;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 带定时功能的线程池.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 16:11
 */
public class ScheduledThreadPoolExectorDemo {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor =
                new ScheduledThreadPoolExecutor(10, Executors.defaultThreadFactory());
        // shcedule 延迟指定时间执行，仅执行一次
        scheduledThreadPoolExecutor.schedule(() -> {
            System.out.println("正在执行定时任务");
        }, 1, TimeUnit.SECONDS);

        // scheduleWithFixedDelay，是以上一个任务结束时开始计时，period时间过去后，立即执行。
        scheduledThreadPoolExecutor.scheduleWithFixedDelay(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("正在执行固定周期的任务");
                }
                , 2, 2, TimeUnit.SECONDS);
        // scheduleAtFixedRate ，是以上一个任务开始的时间计时，period时间过去后，检测上一个任务是否执行完毕，
        // 如果上一个任务执行完毕，则当前任务立即执行，如果上一个任务没有执行完毕，则需要等上一个任务执行完毕后立即执行。
        scheduledThreadPoolExecutor.scheduleAtFixedRate(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("正在执行递增");
        }, 2, 2, TimeUnit.SECONDS);

        // 此时的shutdown是无效的
        scheduledThreadPoolExecutor.shutdown();
        // shutdownNow才是有效的
        // scheduledThreadPoolExecutor.shutdownNow();
    }

}
