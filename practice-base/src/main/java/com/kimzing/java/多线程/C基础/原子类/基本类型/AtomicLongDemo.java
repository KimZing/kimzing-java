package com.kimzing.java.多线程.C基础.原子类.基本类型;

import java.util.concurrent.atomic.AtomicLong;

/**
 * AtomicLong.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 14:25
 */
public class AtomicLongDemo {

    public static void main(String[] args) {
        // 内部使用unsafe.compareAndSwapLong实现
        AtomicLong atomicLong = new AtomicLong();
        System.out.println(atomicLong.getAndIncrement());
        System.out.println(atomicLong.incrementAndGet());
        System.out.println(atomicLong.get());


    }

}
