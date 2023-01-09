package com.kimzing.netty.rpc.protocol.core;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseBody implements Serializable {

    private Object data;
    private String msg;
}
