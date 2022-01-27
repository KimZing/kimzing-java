package com.kimzing.java.多线程.A实验;

import lombok.extern.java.Log;

import java.util.concurrent.TimeUnit;

/**
 * 并发和串行的速度对比.
 * <p>
 * 并行有时候比串行执行的效率要低
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/1/20 11:39
 */
@Log
public class 对比并发和串行的执行效率 {

    /**
     * 执行次数
     */
    private static final int count = 1_0000;

    public static void main(String[] args) throws InterruptedException {
        serial();
        concurrency();
        TimeUnit.MINUTES.sleep(1_0000);
    }

    /**
     * 串行，单线程
     */
    private static void serial() {
        long startTime = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        log.info("串行耗时:" + (System.currentTimeMillis() - startTime) + ",a=" + a + ",b=" + b);
    }

    /**
     * 并行，使用新的线程和main线程
     */
    private static void concurrency() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            int a = 0;
            for (int i = 0; i < count; i++) {
                a += 5;
            }
        });
        thread.start();
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        thread.join();
        log.info("并发耗时:" + (System.currentTimeMillis() - startTime) + ",b=" + b);
    }

}
