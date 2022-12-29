package com.kimzing.netty.serializer.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 请求信息.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 14:56
 */
@Data
@AllArgsConstructor
public class KimMessage implements Serializable {

    private Header header;
    private Object body;

}
