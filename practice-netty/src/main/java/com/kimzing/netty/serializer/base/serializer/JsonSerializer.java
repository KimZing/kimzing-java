package com.kimzing.netty.serializer.base.serializer;

import com.alibaba.fastjson.JSON;

import java.nio.charset.StandardCharsets;

/**
 * Json序列化.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/24 15:08
 */
public class JsonSerializer implements Serializer {

    public static final JsonSerializer INSTANCE = new JsonSerializer();

    @Override
    public <T> byte[] serialize(T t) {
        return JSON.toJSONString(t).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        String json = new String(bytes, StandardCharsets.UTF_8);
        return json == null || json.equals("null") ? null : JSON.parseObject(json, clazz);
    }
}
