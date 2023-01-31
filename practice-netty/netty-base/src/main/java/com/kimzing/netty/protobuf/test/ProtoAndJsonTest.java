package com.kimzing.netty.protobuf.test;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.kimzing.netty.protobuf.entity.MessageProto;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/28 17:40
 */
public class ProtoAndJsonTest {

    /**
     * 在表示同样内容所占的大小
     * @param args
     */
    public static void main(String[] args) throws InvalidProtocolBufferException {
        byte[] protoBytes = getProtoBytes();
        byte[] jsonBytes = getJsonBytes();
        System.out.println(String.format("proto size: %d, json size: %d", protoBytes.length, jsonBytes.length));
        System.out.println("protoBuf还原: " + MessageProto.Message.parseFrom(protoBytes));
        System.out.println("json 还原: " + JSON.parseObject(jsonBytes, Message.class));
    }

    private static byte[] getJsonBytes() {
        Message message = new Message();
        message.setHeader(new Header(1L, (byte) 1, (byte) 1, (byte) 1));
        return JSON.toJSONBytes(message);
    }

    private static byte[] getProtoBytes() {
        MessageProto.Message message = MessageProto.Message.newBuilder()
                .setHeader(
                        MessageProto.Header.newBuilder()
                                .setVersion(1)
                                .setLanguage(ByteString.copyFrom(new byte[]{1}))
                                .setSerializer(ByteString.copyFrom(new byte[]{1}))
                                .setReqType(ByteString.copyFrom(new byte[]{1}))
                                .build()
                ).build();
        return message.toByteArray();
    }

}
