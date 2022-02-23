package com.kimzing.java.多线程.C基础;

import java.util.concurrent.TimeUnit;

/**
 * 演示ThreadLocal用法.
 * <p>
 *     ThreadA先设置了threadLocal变量为A，随后ThreadB读取该值仍为线程B自己的初始值
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/18 13:38
 */
public class 线程变量_ThreadLocal {

    private static final ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> Thread.currentThread().getName());

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new RunnableA(), "A");
        Thread threadB = new Thread(new RunnableB(), "B");
        threadA.start();
        threadA.join();
        threadB.start();
    }

    static class RunnableA implements Runnable {

        @Override
        public void run() {
            threadLocal.set(Thread.currentThread().getName());
        }
    }

    static class RunnableB implements Runnable {

        @Override
        public void run() {
            System.out.println(threadLocal.get());
        }
    }
}
