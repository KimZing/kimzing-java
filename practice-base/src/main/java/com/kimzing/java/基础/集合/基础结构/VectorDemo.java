package com.kimzing.java.基础.集合.基础结构;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 几乎不使用了.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 16:31
 */
public class VectorDemo {

    private static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        // 内部使用syncronized进行包装，性能比较差
        Vector<Object> objects = new Vector<>();
        // 如果需要线程同步，可以使用collections进行包装，或者业务中使用锁
        // 包装
        List<Object> syncList = Collections.synchronizedList(list);
        // 锁,假设一下添加和删除时多线程执行
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            list.add(1);
        } finally {
            lock.unlock();
        }

        lock.lock();
        try {
            System.out.println(list.remove(0));
        } finally {
            lock.unlock();
        }
    }

}
