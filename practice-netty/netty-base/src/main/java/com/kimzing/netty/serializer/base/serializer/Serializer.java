package com.kimzing.netty.serializer.base.serializer;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/24 15:07
 */
public interface Serializer {

    <T> byte[] serialize(T t);

    <T> T deserialize(Class<T> clazz, byte[] bytes);

}
