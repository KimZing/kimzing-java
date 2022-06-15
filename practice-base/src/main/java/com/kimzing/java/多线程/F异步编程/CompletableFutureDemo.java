package com.kimzing.java.多线程.F异步编程;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 异步化编程. 这个其实属于编程方式层面的工具，内部使用forkjoin框架，主要是解决任务的编排的。
 * <p>
 *     completionService是解决结果的处理的
 * </p>
 * <p>
 *     分了 3 个任务：任务 1 负责洗水壶、烧开水，任务 2 负责洗茶壶、洗茶杯和拿茶叶，任务 3 负责泡茶。其中任务 3 要等待任务 1 和任务 2 都完成后才能开始。
 * </p>
 *
 * <p>
 *     supplier关键字   提供者
 *     apply  combine关键字     接收并返回
 *     accept         接收不返回
 *     run           执行某个动作
 *
 *     complete  直接完成进行通知
 *     异常处理：exceptionally  whencomplete可以拿到异常和结果   handle可以拿到异常进行处理新的返回结果
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 19:39
 */
public class CompletableFutureDemo {

    private static List<Integer> results = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws Exception {
        // demo1();
        demo2();
    }

    /**
     * 并行执行五个任务，全部执行完成后执行指定操作
     */
    public static void demo2() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(CompletableFutureDemo::exec1);
        CompletableFuture<Void> f2 = CompletableFuture.runAsync(CompletableFutureDemo::exec2);
        CompletableFuture<Void> f3 = CompletableFuture.runAsync(CompletableFutureDemo::exec3);
        CompletableFuture<Integer> result = CompletableFuture.allOf(f1, f2, f3).handle((r, t) -> {
            if (t == null) {
                return results.stream().sorted((o1, o2) -> o2 - o1).findFirst().orElseGet(null);
            }
            return null;
        });
        System.out.println(result.get());
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void exec1() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " 正在执行1");
            results.add(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exec2() {
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " 正在执行2");
            results.add(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exec3() {
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
            System.out.println(Thread.currentThread().getName()  + " 正在执行3");
            results.add(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demo1() {
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
