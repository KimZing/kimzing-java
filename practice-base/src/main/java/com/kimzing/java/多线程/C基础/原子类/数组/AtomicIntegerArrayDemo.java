package com.kimzing.java.多线程.C基础.原子类.数组;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 原子操作数组.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 14:49
 */
public class AtomicIntegerArrayDemo {

    public static void main(String[] args) {
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(10);
        System.out.println(atomicIntegerArray.getAndIncrement(1));
        System.out.println(atomicIntegerArray.getAndIncrement(1));
        System.out.println(atomicIntegerArray.compareAndSet(1, 2, 5));
        System.out.println(atomicIntegerArray.get(1));
    }

}
