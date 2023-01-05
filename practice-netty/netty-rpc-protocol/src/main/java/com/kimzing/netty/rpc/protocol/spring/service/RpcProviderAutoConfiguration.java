package com.kimzing.netty.rpc.protocol.spring.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RpcServerProperties.class)
public class RpcProviderAutoConfiguration {


    @Bean
    public SpringRpcProviderBean springRpcProviderBean(RpcServerProperties rpcServerProperties){
        return new SpringRpcProviderBean(rpcServerProperties.getServicePort(),rpcServerProperties.getServiceAddress());
    }
}
