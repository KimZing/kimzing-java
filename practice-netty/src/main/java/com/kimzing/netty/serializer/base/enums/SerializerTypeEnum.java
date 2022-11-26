package com.kimzing.netty.serializer.base.enums;

import com.kimzing.netty.serializer.base.serializer.JavaSerializer;
import com.kimzing.netty.serializer.base.serializer.JsonSerializer;
import com.kimzing.netty.serializer.base.serializer.Serializer;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:02
 */
public enum SerializerTypeEnum {
    // Java序列化
    JAVA((byte)1, JavaSerializer.INSTANCE),
    // Json序列化
    JSON((byte)2, JsonSerializer.INSTANCE);

    public Serializer serialize;

    public byte code;

    SerializerTypeEnum(byte code, Serializer serializer) {
        this.code = code;
        this.serialize = serializer;
    }

    public static SerializerTypeEnum fromCode(byte code){
        for (SerializerTypeEnum type : SerializerTypeEnum.values()) {
            if (type.code == code) {
                return type;
            }
        }
        return null;
    }

    public <T> byte[] serialize(T t){
        return this.serialize.serialize(t);
    }

    public <T> T deserialize(Class<T> clazz, byte[] bytes){
        return this.serialize.deserialize(clazz, bytes);
    }

}
