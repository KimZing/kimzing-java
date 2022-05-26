package com.kimzing.java.多线程.B示例.LockSupport;

import java.util.concurrent.locks.LockSupport;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/25 13:55
 */
public class LockSupportDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            LockSupport.park();
            System.out.println("thread1");
        });

        Thread thread2 = new Thread(() -> {
            LockSupport.park();
            System.out.println("thread2");
            LockSupport.unpark(thread1);
        });

        thread1.start();
        thread2.start();

        // 主动唤醒线程2
        LockSupport.unpark(thread2);

        // 暂停自己，永远不会被唤醒
        LockSupport.park();
    }

}
