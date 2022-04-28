package com.kimzing.java.多线程.A示例.自定义互斥锁;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;

/**
 * 独占锁.
 * <p>
 *     同一时刻只能有一个线程获取到锁，state=0 无锁状态，state=1 锁被占用
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/4/27 17:39
 */
public class KimMutex {

    private final KimSync kimSync = new KimSync();

    /**
     * 获取锁，获得锁后从该方法返回
     */
    public void lock() {
        kimSync.acquire(1);
    }

    /**
     * 非阻塞获取锁，能够获得直接返回true，否则返回false
     */
    public boolean tryLock() {
        return kimSync.tryAcquire(1);
    }

    /**
     * 超时获取锁，三种情况下会返回
     * <p>
     *     1. 当线程超时时间内获取到了锁
     *     2. 超时时间内中断
     *     3. 超时时间结束，返回false
     * </p>
     */
    public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
        return kimSync.tryAcquireNanos(1, unit.toNanos(timeout));
    }

    /**
     * 释放锁
     */
    public void unlock() {
        kimSync.release(1);
    }

    /**
     * 锁是否已经被线程占用
     */
    public boolean isLocked() {
        return kimSync.isHeldExclusively();
    }

    /**
     * 获取等待通知组件，该组件和当前锁绑定，只有获得了锁，才能调用组件的wait方法，调用后，线程将释放锁
     */
    public Condition newCondition() {
        return kimSync.newCondition();
    }

    /**
     * 获取等待在同步队列上的线程集合
     * @return
     */
    public boolean hasQueuedThreads() {
        return kimSync.hasQueuedThreads();
    }

    class KimSync extends AbstractQueuedSynchronizer {
        @Override
        protected boolean tryAcquire(int acquires) {
            // 如果cas设置成功则代表获取到了锁
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int acquires) {
            if (getState() == 0) {
                throw new  IllegalMonitorStateException();
            }
            setState(0);
            setExclusiveOwnerThread(null);
            return true;
        }

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        Condition newCondition() {
            return new ConditionObject();
        }
    }
}
