package com.kimzing.netty.protobuf.entity;

import lombok.Data;

/**
 * 仅用于测试对比.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/28 17:38
 */
@Data
public class Message<T> {

    private Header header;
    private T body;
}


