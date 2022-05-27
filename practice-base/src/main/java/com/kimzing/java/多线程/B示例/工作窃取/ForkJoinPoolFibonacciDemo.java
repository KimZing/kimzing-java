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
        Fibonacci fibonacciTask = new Fibonacci(20);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> result = forkJoinPool.submit(fibonacciTask);
        if (fibonacciTask.isCompletedAbnormally()) {
            System.out.println(fibonacciTask.getException());
        }
        System.out.println(result.get());

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
        } ;
        Fibonacci f1 = new Fibonacci(n - 1);
        Fibonacci f2 = new Fibonacci(n - 2);
        f1.fork();
        f2.fork();
        System.out.println(Thread.currentThread().getName() + "拆分中");
        return f2.join() + f1.join();
    }
}