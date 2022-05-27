package com.kimzing.java.多线程.B示例.队列.非阻塞;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 有界队列测试.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/25 17:22
 */
public class ConcurrentLinkedQueueTest {


    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> linkedQueue = new ConcurrentLinkedQueue();
        // 分别创建十个添加和删除线程
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                linkedQueue.offer(12);
            }, "offer" + i).start();

            new Thread(() -> {
                Object remove = linkedQueue.poll();
            }, "poll" + i).start();
        }
    }

}
