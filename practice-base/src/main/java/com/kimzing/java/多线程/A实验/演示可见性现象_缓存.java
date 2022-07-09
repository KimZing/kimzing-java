package com.kimzing.java.多线程.A实验;

import java.util.concurrent.TimeUnit;

/**
 * 演示CPU私有缓存导致的死循环.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/5 09:17
 */
public class 演示可见性现象_缓存 {

    public static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (flag) {
                i++; // 一直做运算，占用CPU。否则还是会结束的，应该是因为空闲了会刷新缓存
            }
            System.out.println("t1 stop");
        }).start();
        System.out.println("t1 start");
        TimeUnit.SECONDS.sleep(1);
        flag = false;
    }

}
