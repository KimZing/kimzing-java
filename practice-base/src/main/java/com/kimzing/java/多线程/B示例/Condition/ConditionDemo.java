package com.kimzing.java.多线程.B示例.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock条件示例. 类比notify wait
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/25 14:12
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class ConditionDemo {

    private static final ReentrantLock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "开始执行");
                condition.await();
                System.out.println(Thread.currentThread().getName() + "执行完成");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "开始执行");
                condition.signal();
                System.out.println(Thread.currentThread().getName() + "执行完成");
            } finally {
                lock.unlock();
            }
        }, "t2");
        t1.start();
        t2.start();

        LockSupport.parkUntil(System.currentTimeMillis() + 2000);

        /**
         *
         * 第一种情况，t2先执行
         t2开始执行
         t2执行完成
         t1开始执行

         * 第二种情况，t1先执行
         t1开始执行
         t2开始执行
         t2执行完成
         t1执行完成
         */
    }

}
