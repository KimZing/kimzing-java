package com.kimzing.java.多线程.实验;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 重排序.
 * <p>
 * 线程1先执行，线程2后执行可能出现的值
 * x=1 y=0
 * x=1 y=1
 * 线程2先执行，线程1后执行可能出现的值
 * x=0 y=1
 * x=1 y=1(相同)
 * 常规来说，会出现以上共三种状况
 * <p>
 * 但是如果进行了重排序，则会出现x=0,y=0的结果。就是把y=b和x=a排序到了赋值的前面
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/1/24 13:55
 */
public class 演示重排序的现象 {

    private static int a, b = 0;
    private static int x, y = 0;

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            i++;
            a = 0;
            b = 0;
            x = 0;
            y = 0;
            // 由于x =1, y=1这种情况需要在线程代码中间切换后可见，所以需要使用CountDownlatch让他们同时等待、并同时执行，复现的概率会大
            CountDownLatch latch = new CountDownLatch(1);
            Thread t1 = new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a = 1;
                y = b;
            });
            Thread t2 = new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b = 1;
                x = a;
            });
            t1.start();
            t2.start();
            latch.countDown();
            t1.join();
            t2.join();

            System.out.println("i=" + i + ",x = " + x + ", y = " + y);
            if (x == 0 && y == 0) {
                break;
            }
        }
    }

}
