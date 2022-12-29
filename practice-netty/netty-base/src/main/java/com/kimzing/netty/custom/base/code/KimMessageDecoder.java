package com.kimzing.netty.custom.base.code;

import com.kimzing.netty.custom.base.entity.Header;
import com.kimzing.netty.custom.base.entity.KimMessage;
import com.kimzing.netty.custom.base.entity.User;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
        // 获取头对象
        int headerLength = buf.readInt();
        byte[] headerBytes = new byte[headerLength];
        buf.readBytes(headerBytes);
        Header header = deserialize(headerBytes, Header.class);
        // 获取body对象
        int bodyLength = buf.readableBytes();
        byte[] bodyBytes = new byte[bodyLength];
        buf.readBytes(bodyBytes);
        User user = deserialize(bodyBytes, User.class);
        return new KimMessage(header, user);
    }

    private <T> T deserialize(byte[] headerBytes, Class<T> clazz) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(headerBytes));
            return (T)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
