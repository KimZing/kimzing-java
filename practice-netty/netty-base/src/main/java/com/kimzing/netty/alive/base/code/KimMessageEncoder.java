package com.kimzing.netty.alive.base.code;

import com.kimzing.netty.alive.base.entity.KimMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:15
 */
public class KimMessageEncoder extends MessageToByteEncoder<KimMessage> {

    @Override
    protected void encode(ChannelHandlerContext ctx, KimMessage msg, ByteBuf out) throws Exception {
        byte[] header = serialize(msg.getHeader());
        byte[] body = serialize(msg.getBody());

        // 总长度  第一个4：总长度自身字段占用的长度为4    第二个4：头部长度自身字段占用的长度为4
        int totalLength = 4 + 4 + header.length + body.length;
        out.writeInt(totalLength);
        // 头部长度
        int headerLength = header.length;
        out.writeInt(headerLength);
        // 头部数据
        out.writeBytes(header);
        // 主题数据
        out.writeBytes(body);
    }

    private <T> byte[]  serialize(T t) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(t);
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
