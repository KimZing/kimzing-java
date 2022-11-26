package com.kimzing.netty.serializer.base.code;

import com.kimzing.netty.serializer.base.entity.KimMessage;
import com.kimzing.netty.serializer.base.enums.SerializerTypeEnum;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:15
 */
public class KimMessageEncoder extends MessageToByteEncoder<KimMessage> {

    private SerializerTypeEnum serializerType = SerializerTypeEnum.JSON;

    @Override
    protected void encode(ChannelHandlerContext ctx, KimMessage msg, ByteBuf out) throws Exception {
        msg.getHeader().setSerializer(serializerType);
        byte[] header = serializerType.serialize(msg.getHeader());
        byte[] body = serializerType.serialize(msg.getBody());

        // 总长度  第一个4：总长度自身字段占用的长度为4    第二个4：头部长度自身字段占用的长度为4
        int totalLength = 4 + 4 + header.length + body.length;
        out.writeInt(totalLength);
        // 序列化方式和头部长度信息
        byte[] serializerTypeAndHeaderLength = getSerializerTypeAndHeaderLength(serializerType, header.length);
        out.writeBytes(serializerTypeAndHeaderLength);
        // 头部数据
        out.writeBytes(header);
        // 主题数据
        out.writeBytes(body);
    }

    private byte[] getSerializerTypeAndHeaderLength(SerializerTypeEnum serializer, int length) {
        byte[] result = new byte[4];
        result[0] = serializer.code;
        // 00000000(类型) 00000000(1) 00000000(2) 00000000(3)
        // & 0xFF 二进制为11111111，也就是获取指定某个byte
        // 获取(1)的二进制
        result[1] = (byte) ((length >> 16) & 0xFF);
        // 获取(2)的二进制
        result[2] = (byte) ((length >> 8) & 0xFF);
        // 获取(3)的二进制
        result[3] = (byte) (length & 0xFF);
        return result;
    }

}
