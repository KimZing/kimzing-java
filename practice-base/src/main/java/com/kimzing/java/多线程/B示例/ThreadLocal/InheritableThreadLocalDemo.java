package com.kimzing.java.多线程.B示例.ThreadLocal;

import java.util.concurrent.TimeUnit;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/11 11:00
 */
public class InheritableThreadLocalDemo {

    public static void main(String[] args) {
        InheritableThreadLocal<String> iit = new InheritableThreadLocal(){};

        new Thread(() -> {
            // 设置值
            iit.set("parentValue");
            // 创建新线程看看是否传递
            new Thread(() -> {
                for (;;) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(iit.get());
                }
            }).start();
            iit.set("update");
            System.out.println("父线程更新了值");
        }).start();
    }

}
