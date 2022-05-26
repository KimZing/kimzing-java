package com.kimzing.java.多线程.B示例.Condition;

/**
 * 有界队列测试.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/25 17:22
 */
public class BoundedQueueTest {


    public static void main(String[] args) {
        BoundedQueue<Integer> boundedQueue = new BoundedQueue(10);
        // 分别创建十个添加和删除线程
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    boundedQueue.put(12);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "add" + i).start();

            new Thread(() -> {
                try {
                    Object remove = boundedQueue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            },"remove" + i).start();
        }
    }

}
