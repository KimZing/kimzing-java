package com.kimzing.netty.rpc.protocol.spring.reference;

import lombok.Data;

@Data
public class RpcClientProperties {

    private String serviceAddress;

    private int servicePort;
}
