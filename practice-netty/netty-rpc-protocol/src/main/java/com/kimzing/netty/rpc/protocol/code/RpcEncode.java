package com.kimzing.netty.rpc.protocol.code;

import com.kimzing.netty.rpc.protocol.core.Header;
import com.kimzing.netty.rpc.protocol.core.RpcProtocal;
import com.kimzing.netty.rpc.protocol.serial.ISerializer;
import com.kimzing.netty.rpc.protocol.serial.SerializerManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class RpcEncode extends MessageToByteEncoder<RpcProtocal<Object>> {


    @Override
    protected void encode(ChannelHandlerContext ctx, RpcProtocal<Object> msg, ByteBuf out) throws Exception {

        Header header = msg.getHeader();

        out.writeShort(header.getMagic());
        out.writeByte(header.getSerialType());
        out.writeByte(header.getReqType());
//        out.writeInt(header.getLength());
        out.writeLong(header.getRequestId());

        ISerializer serializer = SerializerManager.getSerializer(header.getSerialType());
        // 序列化数据内容
        byte[] data = serializer.serialize(msg.getContent());
        // 数据内容的长度
        out.writeInt(data.length);
        // 写入数据
        out.writeBytes(data);



    }
}
