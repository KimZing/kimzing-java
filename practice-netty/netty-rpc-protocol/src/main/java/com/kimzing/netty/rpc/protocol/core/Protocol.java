package com.kimzing.netty.rpc.protocol.core;

import lombok.Data;

import java.io.Serializable;

@Data
public class Protocol<T> implements Serializable {

    private Header header;

    private T body;
}
