package com.kimzing.java.多线程.C基础.原子类.基本类型;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * AtomicBoolean.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 14:25
 */
public class AtomicBooleanDemo {

    public static void main(String[] args) {
        // 内部使用unsafe.compareAndSwapInt实现,将boolean转化为0，1，char float double也可以用这个思路实现
        AtomicBoolean atomic = new AtomicBoolean();
        System.out.println(atomic.getAndSet(true));
        System.out.println(atomic.compareAndSet(true, false));
        System.out.println(atomic.get());
    }

}
