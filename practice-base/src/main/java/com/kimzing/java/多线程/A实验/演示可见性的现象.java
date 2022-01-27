package com.kimzing.java.多线程.A实验;

/**
 * 可见性.
 * <p>
 *     t1先执行
 *     a=3 b=3
 *     a=3 b=2
 *     t2先执行
 *     a=1 b=2
 *
 *     t1中已经把a=3 b=a完成了，此时a、b=3, 但是写缓冲区把b写入到主存，但a没有刷新到主存，则会存在b=3  a=1的情况
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/1/24 15:43
 */
public class 演示可见性的现象 {

    private static int a = 1;
    private static int b = 2;

    public static void main(String[] args) {
        while (true) {
            a = 1;
            b = 2;
            Thread t1 = new Thread(() -> {
                a = 3;
                b = a;
            });

            Thread t2 = new Thread(() -> System.out.println("a=" + a + ",b=" + b));
            t1.start();
            t2.start();
        }

    }

}
