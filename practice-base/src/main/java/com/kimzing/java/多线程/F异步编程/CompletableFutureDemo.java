package com.kimzing.java.多线程.F异步编程;

import java.util.concurrent.CompletableFuture;

/**
 * 异步化编程. 这个其实属于编程方式层面的工具，内部使用forkjoin框架，主要是解决任务的编排的。
 * <p>
 *     completionService是解决结果的处理的
 * </p>
 * <p>
 *     分了 3 个任务：任务 1 负责洗水壶、烧开水，任务 2 负责洗茶壶、洗茶杯和拿茶叶，任务 3 负责泡茶。其中任务 3 要等待任务 1 和任务 2 都完成后才能开始。
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 19:39
 */
public class CompletableFutureDemo {

    public static void main(String[] args) {
        CompletableFuture<Void> task1 = CompletableFuture.runAsync(() -> {
            System.out.println("洗水壶、烧开水");
        });
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("洗茶壶、洗茶杯和拿茶叶");
            System.out.println(7/0);
            return "龙井";
        // 异常处理
        }).exceptionally(e -> "茶壶摔坏了");
        task1.thenCombine(task2, (p1, p2) -> {
            System.out.println("可以喝茶了" + p2);
            return "上茶";
        });
    }

}
