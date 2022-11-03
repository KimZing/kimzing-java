package com.kimzing.java.网络.reactor.single;

import java.io.IOException;

/**
 * 单Reactor单线程模型.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 10:42
 */
public class SingleMain {

    public static void main(String[] args) throws IOException {
        new Thread(new SingleReactor()).start();
    }

}
