package com.kimzing.netty.rpc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.kimzing.netty.rpc.provider.service","com.kimzing.netty.rpc.protocol.spring.service"})
@SpringBootApplication
public class NettyRpcProvider {

    public static void main(String[] args) {
        SpringApplication.run(NettyRpcProvider.class,args);
    }
}
