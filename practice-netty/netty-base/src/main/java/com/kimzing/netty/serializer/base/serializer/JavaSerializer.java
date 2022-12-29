package com.kimzing.netty.serializer.base.serializer;

import java.io.*;

/**
 * Java序列化.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/24 15:08
 */
public class JavaSerializer implements Serializer {

    public static final JavaSerializer INSTANCE = new JavaSerializer();

    @Override
    public <T> byte[] serialize(T t) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(t);
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
            return (T)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
