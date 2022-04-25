package com.kimzing.java.多线程.C基础;

import java.util.concurrent.TimeUnit;

/**
 * 测试线程中断.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/16 13:49
 */
public class 线程中断interrupt_flag {

    public static void main(String[] args) throws InterruptedException {
        // 一个正常运行，无睡眠阻塞操作的线程，调用interrupt方法会设置中断标识为true，但线程并不会真的中断，只是代表收到了中断信号
        Thread thread1 = new Thread(() -> {
            while (true) {}
        });
        thread1.start();
        TimeUnit.SECONDS.sleep(2);
        thread1.interrupt();
        System.out.println("thread1中断状态:" + thread1.isInterrupted());

        // 演示收到中断后就停止执行
        Thread thread2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
            }
        });
        thread2.start();
        TimeUnit.SECONDS.sleep(2);
        thread2.interrupt();
        // true
        System.out.println("thread2中断状态:" + thread2.isInterrupted());
        TimeUnit.SECONDS.sleep(2);
        // false  当不满足循环条件时线程执行结束，此时的interrupted也会变为false
        System.out.println("thread2成功中断后状态:" + thread2.isInterrupted());

        // 线程睡眠时被中断，会直接抛出异常终止，并恢复中断状态为false
        Thread thread3 = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread3.start();
        TimeUnit.SECONDS.sleep(2);
        thread3.interrupt();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("thread3睡眠时的中断状态:" + thread3.isInterrupted());

        // 演示通过标志位进行中断线程，缺点是阻塞时无法响应
        Runner runner = new Runner();
        Thread thread5 = new Thread(runner);
        thread5.start();
        TimeUnit.SECONDS.sleep(1);
        runner.cancel();
    }


    public static class Runner implements Runnable {

        private volatile boolean cancel = false;

        @Override
        public void run() {
            int i = 0;
            while(!cancel && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("i的值为:" + i);
        }

        public void cancel() {
            cancel = true;
        }

    }

}
