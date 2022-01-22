package com.kimzing.java.多线程.实验;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.awt.SystemColor.info;

/**
 * 演示线程安全的CAS计数器和非线程安全的计数器.
 *
 * <p>
 * 启用100个线程，每个线程都对i和atomicI做1000次+1操作，最后比对结果
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/1/21 16:57
 */
@Log
public class CommonCounterAndCASCounter {

    private int i = 0;
    private AtomicInteger atomicI = new AtomicInteger(0);

    public static void main(String[] args) {
        CommonCounterAndCASCounter counter = new CommonCounterAndCASCounter();
        // 准备100个线程
        ArrayList<Thread> threads = new ArrayList<>();
        Stream.iterate(0, i -> i + 1)
                .limit(100)
                .forEach(i -> threads.add(new Thread(() -> {
                    for (int i1 = 0; i1 < 1000; i1++) {
                        counter.count();
                        counter.safeCount();
                    }
                })));
        threads.stream().forEach(thread -> thread.start());
        threads.stream().forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        log.info("非安全:" + counter.i);
        log.info("安全:" + counter.atomicI.get());
    }

    private void count() {
        i++;
    }

    private void safeCount() {
        // atomicI.addAndGet(1);

        for (; ; ) {
            int i = atomicI.get();
            boolean success = atomicI.compareAndSet(i, ++i);
            if (success) {
                break;
            }
        }
    }

}
