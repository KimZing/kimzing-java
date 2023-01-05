package com.kimzing.netty.rpc.protocol.core;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

@Data
public class RpcRequest implements Serializable {

    private String className;// 类名
    private String methodName;// 方法名称
    private Object[] params;// 请求参数
    private Class<?>[] parameterTypes;//参数类型

    public void setParams(Object[] params) {
        this.params = new Object[params.length];
        for (int i = 0; i < params.length; i++) {
            this.params[i] = JSON.parseObject(JSON.toJSONString(params[i]), parameterTypes[i]);
        }
    }
}
