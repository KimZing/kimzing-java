package com.kimzing.java.多线程.B示例.自定义双入锁;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * 支持两个线程同时获取锁.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/4/29 16:48
 */
public class KimTwinsLock {

    private final KimSync kimSync = new KimSync(2);

    public void lock() {
        // 调用的是模板方法
        kimSync.acquireShared(1);
    }

    public void unlock() {
        // 调用的是模板方法
        kimSync.releaseShared(1);
    }


    class KimSync extends AbstractQueuedSynchronizer {

        public KimSync(int count) {
            if (count <= 0) {
                throw new IllegalArgumentException();
            }
            setState(count);
        }

        /**
         * 返回负值代表失败，返回0代表当前获取成功，但后续的获取已经没有资源了，会失败。返回正数代表成功
         *
         * @param args the acquire argument. This value is always the one
         *            passed to an acquire method, or is the value saved on entry
         *            to a condition wait.  The value is otherwise uninterpreted
         *            and can represent anything you like.
         * @return
         */
        @Override
        protected int tryAcquireShared(int args) {
            for (;;) {
                int expect = getState();
                int update = expect - args;
                // 第一个判断条件：如果update为负数，说明没有锁可用，直接返回
                // 第一个不满足时：如果update>=0, 说明仍有资源可获取，此时再去尝试获取锁(获取成功了则返回，获取失败了则自旋循环再次尝试)
                if (update < 0  || compareAndSetState(expect, update)) {
                    return update;
                }
            }
        }

        @Override
        protected boolean tryReleaseShared(int args) {
            for (;;) {
                int expect = getState();
                int update = expect + args;
                // 此时可能存在多个线程同时释放，所以需要安全的设置State的值
                if (compareAndSetState(expect, update)) {
                    return true;
                }
            }
        }
    }

}
