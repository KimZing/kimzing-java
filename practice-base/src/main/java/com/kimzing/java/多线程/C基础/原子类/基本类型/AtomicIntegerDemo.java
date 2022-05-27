package com.kimzing.java.多线程.C基础.原子类.基本类型;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 14:25
 */
public class AtomicIntegerDemo {

    public static void main(String[] args) {
        // 内部使用unsafe.compareAndSwapInt实现
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.get());


    }

}
