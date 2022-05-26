package com.kimzing.java.多线程.B示例.读写锁;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁示例.
 * <p>
 * 通过ReadWriteLock锁维护管理一个线程不安全的HashMap来实现缓存，达到线程安全的目的
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/25 11:28
 */
public class ReadWriteLockCache {

    private static final HashMap<String, Object> cache = new HashMap<>();
    private static final ReentrantReadWriteLock readwriteLock = new ReentrantReadWriteLock();
    private static final Lock readLock = readwriteLock.readLock();
    private static final Lock writeLock = readwriteLock.writeLock();

    public Object get(String key) {
        readLock.lock();
        try {
            return cache.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public void put(String key, Object value) {
        writeLock.lock();
        try {
            cache.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

    public void clear() {
        writeLock.lock();
        try {
            cache.clear();
        } finally {
            writeLock.unlock();
        }
    }
}
