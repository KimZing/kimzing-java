package com.kimzing.java.多线程.A实验;

/**
 * 是新的实例，不会将值传递过来.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/11 13:32
 */
public class 同名的ThreadLocal会不会覆盖 {

    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        ThreadLocal<String> stringLocal = new ThreadLocal<>();
        System.out.println(stringLocal.get());
    }


    private static void method1() {
        ThreadLocal<String> stringLocal = new ThreadLocal<>();
        stringLocal.set("123");
    }

}
