package com.kimzing.java.多线程.B示例.工作窃取;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 斐波那契窃取.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 11:36
 */
public class ForkJoinPoolFibonacciDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Fibonacci fibonacciTask = new Fibonacci(25);
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        long start = System.currentTimeMillis();
        ForkJoinTask<Integer> result = forkJoinPool.submit(fibonacciTask);
        if (fibonacciTask.isCompletedAbnormally()) {
            System.out.println(fibonacciTask.getException());
        }
        System.out.println(result.get());
        System.out.println("共耗时：" + (System.currentTimeMillis() - start));

    }

}

class Fibonacci extends RecursiveTask<Integer> {
    final int n;

    Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public Integer compute() {
        if (n <= 1) {
            System.out.println("计算中");
            return n;
        }
        ;
        Fibonacci f1 = new Fibonacci(n - 1);
        Fibonacci f2 = new Fibonacci(n - 2);
        // 用两次fork()在join的时候，需要用这样的顺序：a.fork(); b.fork(); b.join(); a.join();这个要求在JDK官方文档里有说明。
        // 也可以使用f1.join + f2.compute(), f2.fork就不需要了
        f1.fork();
        f2.fork();
        System.out.println(Thread.currentThread().getName() + "拆分中");
        return f2.join() + f1.join();
    }
}