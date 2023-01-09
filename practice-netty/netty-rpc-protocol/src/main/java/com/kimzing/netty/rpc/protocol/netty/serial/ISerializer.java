package com.kimzing.netty.rpc.protocol.netty.serial;

public interface ISerializer {

    JsonSerializer JSON_SERIALIZER = new JsonSerializer();
    JavaSerializer JAVA_SERIALIZER = new JavaSerializer();

    public static ISerializer getSerializer(byte type) {
        if (type == 1) {
            return JSON_SERIALIZER;
        } else {
            return JAVA_SERIALIZER;
        }
    }

    /*
     * 序列化
     */
    <T> byte[] serialize(T obj);

    /**
     * 反序列化
     */
    <T> T deserialize(byte[] data,Class<T> clazz);

}
