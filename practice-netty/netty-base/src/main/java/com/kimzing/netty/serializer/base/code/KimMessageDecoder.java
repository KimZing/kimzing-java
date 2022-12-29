package com.kimzing.netty.serializer.base.code;

import com.kimzing.netty.serializer.base.entity.Header;
import com.kimzing.netty.serializer.base.entity.KimMessage;
import com.kimzing.netty.serializer.base.entity.User;
import com.kimzing.netty.serializer.base.enums.SerializerTypeEnum;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 16:00
 */
public class KimMessageDecoder extends LengthFieldBasedFrameDecoder {
    public KimMessageDecoder() {
        super(Integer.MAX_VALUE, 0, 4, -4, 4);
    }

    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        // 这个方法里面可以根据header中的信息来进行不同的处理
        ByteBuf buf = (ByteBuf) super.decode(ctx, in);
        // 获取序列化类型和头部长度信息
        int serializerTypeAndHeaderLength = buf.readInt();
        // 头部长度
        int headerLength = getHeaderLength(serializerTypeAndHeaderLength);
        // 序列化类型
        SerializerTypeEnum serializer = getSerializerType(serializerTypeAndHeaderLength);
        byte[] headerBytes = new byte[headerLength];
        buf.readBytes(headerBytes);
        Header header = serializer.deserialize(Header.class, headerBytes);
        // 获取body对象
        int bodyLength = buf.readableBytes();
        byte[] bodyBytes = new byte[bodyLength];
        buf.readBytes(bodyBytes);
        User user = serializer.deserialize(User.class, bodyBytes);
        return new KimMessage(header, user);
    }

    private SerializerTypeEnum getSerializerType(int serializerTypeAndHeaderLength) {
        int code = serializerTypeAndHeaderLength >> 24;
        return SerializerTypeEnum.fromCode((byte) code);
    }

    private int getHeaderLength(int serializerTypeAndHeaderLength) {
        return serializerTypeAndHeaderLength & 0xFFFFFF;
    }

}
