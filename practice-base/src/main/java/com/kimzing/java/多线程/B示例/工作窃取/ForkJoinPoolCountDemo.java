package com.kimzing.java.多线程.B示例.工作窃取;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 工作窃取算法.
 * <p>
 * 演示数字连续相加
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 11:10
 */
public class ForkJoinPoolCountDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CountTask countTask = new CountTask(1, 100);
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> result = pool.submit(countTask);
        System.out.println(result.get());
    }

}

class CountTask extends RecursiveTask<Integer> {

    private int start, end;
    private int threshold = 5;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    /**
     * @return 返回体代表结果
     * 内部分为两个步骤：1. 如果达到粒度就直接计算 2. 没达到粒度就进行forkJoin拆分
     */
    @Override
    protected Integer compute() {
        int sum = 0;
        if (end - start <= threshold) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int middle = (start + end) / 2;
            CountTask left = new CountTask(start, middle);
            CountTask right = new CountTask(middle + 1, end);
            // 执行子任务
            left.fork();
            right.fork();
            // 合并子任务
            sum = left.join() + right.join();
        }
        return sum;
    }
}