package com.kimzing.netty.rpc.protocol.netty.code;

import com.kimzing.netty.rpc.protocol.core.Header;
import com.kimzing.netty.rpc.protocol.core.Protocol;
import com.kimzing.netty.rpc.protocol.netty.serial.ISerializer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class RpcEncode extends MessageToByteEncoder<Protocol<Object>> {


    @Override
    protected void encode(ChannelHandlerContext ctx, Protocol<Object> msg, ByteBuf out) throws Exception {

        Header header = msg.getHeader();

        out.writeByte(header.getSerialType());
        out.writeByte(header.getReqType());
        out.writeLong(header.getRequestId());

        ISerializer serializer = ISerializer.getSerializer(header.getSerialType());
        // 序列化数据内容
        byte[] data = serializer.serialize(msg.getBody());
        // 数据内容的长度
        out.writeInt(data.length);
        // 写入数据
        out.writeBytes(data);
    }
}
