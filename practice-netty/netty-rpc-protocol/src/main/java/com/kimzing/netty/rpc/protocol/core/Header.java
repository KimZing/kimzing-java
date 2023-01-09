package com.kimzing.netty.rpc.protocol.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Header implements Serializable {

    private byte serialType;// 序列化类型 1字节     JSON_SERIAL((byte)1) JAVA_SERIAL((byte)2);
    private byte reqType;// 请求类型  1字节 REQUEST((byte)1)  RESPONSE((byte)2)
    private long requestId;// 请求id  8个字节
    private int length;// 消息体长度 4个字节

}
