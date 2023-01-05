package com.kimzing.netty.rpc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.kimzing.netty.rpc.consumer.controller", "com.kimzing.netty.rpc.protocol.spring.reference"})
@SpringBootApplication
public class NettyRpcCumsumer {

    public static void main(String[] args) {
        SpringApplication.run(NettyRpcCumsumer.class, args);
    }
}
