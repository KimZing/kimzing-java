package com.kimzing.java.网络.proactor;

/**
 * 异步IO编程模型.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/4 10:45
 */
public class ProactorEntry {

    public static void main(String[] args) {
        new Thread(new Proactor()).start();
    }

}
