package com.kimzing.java.多线程.F异步编程;

import java.util.concurrent.*;

/**
 * 批量执行异步任务.   针对结果做了处理，先处理完的先获取
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 20:07
 */
public class CompletionServiceDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(Executors.newFixedThreadPool(3));
        completionService.submit(() -> getPrice1());
        completionService.submit(() -> getPrice2());
        completionService.submit(() -> getPrice3());
        // 哪个先执行完就先获取到哪个结果，内部也是使用阻塞队列来实现
        Future<Integer> take = completionService.take();
        System.out.println(take.get());
    }

    private static int getPrice1() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 1;
    }

    private static int getPrice2() {
        return 2;
    }

    private static int getPrice3() {
        return 3;
    }

}
