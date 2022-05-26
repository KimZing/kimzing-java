package com.kimzing.java.多线程.B示例.可重入锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁示例.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/25 11:13
 */
public class RentrantLockDemo {

    private static final ReentrantLock lock = new ReentrantLock(false);
    // 可以和自实现的互斥锁做对比，在stage1获得锁只有，stage2是无法获得锁的
    // private static final KimMutex lock = new KimMutex();


    public static void main(String[] args) {
        stage1();
    }


    public static void stage1() {
        lock.lock();
        try {
            System.out.println("stage1执行完成，开始执行stage2");
            stage2();
        }finally {
            lock.unlock();
        }
    }

    public static void stage2() {
        lock.lock();
        try {
            System.out.println("执行stage2");
        }finally {
            lock.unlock();
        }
    }


}
