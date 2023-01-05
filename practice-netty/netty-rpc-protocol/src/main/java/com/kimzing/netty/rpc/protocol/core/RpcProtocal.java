package com.kimzing.netty.rpc.protocol.core;

import lombok.Data;

import java.io.Serializable;

@Data
public class RpcProtocal<T> implements Serializable {

    private Header header;

    private T content;
}
