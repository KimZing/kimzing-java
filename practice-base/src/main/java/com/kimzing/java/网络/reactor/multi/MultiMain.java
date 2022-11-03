package com.kimzing.java.网络.reactor.multi;

import java.io.IOException;

/**
 * 单Reactor多线程.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 12:01
 */
public class MultiMain {

    public static void main(String[] args) throws IOException {
        new Thread(new MultiReactor()).start();
    }

}
