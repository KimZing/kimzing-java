package com.kimzing.java.多线程.A示例.自定义互斥锁;

import java.util.concurrent.TimeUnit;

/**
 * 独占锁测试.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/4/27 18:17
 */
public class KimMutexTest {

    public static void main(String[] args) throws InterruptedException {
        // testLock();
        testTryLock();
    }

    private static void testTryLock() throws InterruptedException {
        // =============== 演示tryLock===============
        KimMutex mutex = new KimMutex();
        Runnable tryLockRunnable = () -> {
            boolean hasLock = mutex.tryLock();
            if (!hasLock) {
                System.out.println(Thread.currentThread().getName() + "未获得锁，取消执行");
                return;
            }
            try {
                System.out.println(Thread.currentThread().getName() + "获得了锁");
                TimeUnit.SECONDS.sleep(10);
                System.out.println(Thread.currentThread().getName() + "执行完成");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                mutex.unlock();
            }
        };

        Thread thread3 = new Thread(tryLockRunnable, "thread3");
        Thread thread4 = new Thread(tryLockRunnable, "thread4");
        thread3.start();
        thread4.start();

        // 等待线程运行
        TimeUnit.SECONDS.sleep(1);
        System.out.println("当前锁状态:" + mutex.isLocked());
        System.out.println("当前是否有等待线程:" + mutex.hasQueuedThreads());
    }

    private static void testLock() throws InterruptedException {
        // =============== 演示lock===============
        KimMutex mutex = new KimMutex();
        Runnable lockRunnable = () -> {
            mutex.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "获得了锁");
                TimeUnit.SECONDS.sleep(10);
                System.out.println(Thread.currentThread().getName() + "执行完成");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                mutex.unlock();
            }
        };

        Thread thread1 = new Thread(lockRunnable, "thread1");
        Thread thread2 = new Thread(lockRunnable, "thread2");
        thread1.start();
        thread2.start();

        // 等待线程运行
        TimeUnit.SECONDS.sleep(1);

        System.out.println("当前锁状态:" + mutex.isLocked());
        System.out.println("当前是否有等待线程:" + mutex.hasQueuedThreads());
    }

}
