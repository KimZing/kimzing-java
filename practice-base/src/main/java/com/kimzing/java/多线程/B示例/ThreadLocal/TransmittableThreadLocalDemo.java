package com.kimzing.java.多线程.B示例.ThreadLocal;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.threadpool.TtlExecutors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/11 11:00
 */
@SuppressWarnings("ALL")
public class TransmittableThreadLocalDemo {

    public static void main(String[] args) {
        // ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
        // Executor executor = Executors.newFixedThreadPool(1);

        ThreadLocal<String> threadLocal = new TransmittableThreadLocal<>();
        Executor executor = TtlExecutors.getTtlExecutor(Executors.newFixedThreadPool(1));

        new Thread(() -> {
            // 设置值
            threadLocal.set("parentValue");
            // 创建新线程看看是否传递
            executor.execute(() -> {
                System.out.println(threadLocal.get());
            });

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            threadLocal.set("update");
            System.out.println("父线程更新了值");


            executor.execute(() -> {
                System.out.println(threadLocal.get());
            });
        }).start();
    }

}
