package com.kimzing.java.多线程.B示例.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用condition实现有界阻塞队列.
 * <p>
 *  1. 当队列为空时，队列的获取操作将会阻塞获取线程
 *  2. 当队列已满时，队列的插入操作将阻塞插入线程
 * </p>
 *
 *
 * <p>
 *  思路：
 *  1. 给定采用数组结构来实现，数组是固定长度的所以是有界的。
 *  2. 插入和获取都是从下标0开始的，当到达数组最后一个下标(length -1)时，会继续从头开始插入，行程一个环形结构(putIndex takeIndex)。
 *  3. 为了确保数据的正确性，需要为获取和插入做同步操作，同一时间只能有一个获取或者插入。
 *  4. 使用count记录数组中已经存在的数据的长度,方便判断队列是否已满或者为空等操作。
 *  5. put方法中首先判断队列是否已满，如果满了则做等待，没满就添加进数组。take方法中判断队列是否为空，如果为空则等待。
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/25 14:35
 */
public class BoundedQueue<T> {

    private Object[] items;
    private int count, putIndex, takeIndex;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public BoundedQueue(int capacity){
        items = new Object[capacity];
    }


    public void put(T t) throws InterruptedException {
        lock.lock();
        try {
            // 如果元素满了，则等待队列不满的时候再唤醒
            while (count == items.length) {
                notFull.await();
            }
            // 添加元素
            items[putIndex] = t;
            // 如果到达数组末尾，则从头开始，环形的循环
            if (++putIndex == items.length) {
                putIndex = 0;
            }
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException {
        lock.lock();
        try {
            // 当元素为空，则等待队列不空的时候再唤醒
            while (count == 0) {
                notEmpty.await();
            }
            Object item = items[takeIndex];
            // 如果到达数组末尾，则从头开始
            if (++takeIndex == items.length) {
                takeIndex = 0;
            }
            --count;
            notFull.signal();
            return (T) item;
        } finally {
            lock.unlock();
        }
    }
}
