package com.kimzing.java.多线程.D工具类;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.LockSupport;

/**
 * 同步屏障.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 17:26
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () -> {
            System.out.println("触发屏障点");
        });

        Thread thread1 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "到达屏障");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "到达屏障");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        LockSupport.parkNanos(1000000);
    }

}
