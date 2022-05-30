package com.kimzing.java.多线程.D工具类;

import java.util.concurrent.Exchanger;

/**
 * 数据交换.
 * <p>
 *     操作核对示例，AB核对
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/30 10:12
 */
public class ExchangerDemo {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try {
                    String name = Thread.currentThread().getName();
                    String exchangeValue = exchanger.exchange(name);
                    System.out.println(String.format("当前值:%s,交换值：%s", name, exchangeValue));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }

}
