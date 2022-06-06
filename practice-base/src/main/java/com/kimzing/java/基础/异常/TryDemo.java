package com.kimzing.java.基础.异常;

/**
 * 演示基本的异常捕捉.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 19:47
 */
public class TryDemo {


    public static void main(String[] args) {
        try {
            exception(2);
        // 同时捕获多个异常
        } catch (NullPointerException|IllegalArgumentException e) {
            System.out.println("捕获到异常：" + e.getClass().getSimpleName());
            // 即使这里return   finally也会执行
            return;
        } finally {
            System.out.println("执行结束");
        }
    }

    public static void exception(int type) {
        if (type == 1) {
            throw new NullPointerException();
        }
        if (type == 2) {
            throw new IllegalArgumentException();
        }
    }

}
