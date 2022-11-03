package com.kimzing.java.网络.reactor.mainslave;

import java.io.IOException;

/**
 * 主从Reactor多线程模型.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 16:30
 */
public class MainSlaveEntry {

    public static void main(String[] args) throws IOException {
        new Thread(new MainSlaveReactor()).start();
    }

}
