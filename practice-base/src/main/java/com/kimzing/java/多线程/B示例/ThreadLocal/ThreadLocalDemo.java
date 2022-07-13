package com.kimzing.java.多线程.B示例.ThreadLocal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/11 10:49
 */
public class ThreadLocalDemo {

   private static final ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal() {
       @Override
       protected Object initialValue() {
           //  初始值
           return new SimpleDateFormat();
       }
   };

    public static void main(String[] args) {
        new Thread(() -> {
            // 这里虽然设置了新值，但是线程内部的，不会影响下一个线程
            sdf.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            System.out.println(sdf.get().format(new Date()));
        }).start();

        new Thread(() -> {
            System.out.println(sdf.get().format(new Date()));
        }).start();
    }

}
