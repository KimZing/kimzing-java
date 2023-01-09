package com.kimzing.netty.rpc.protocol.netty.code;

import com.kimzing.netty.rpc.protocol.core.*;
import com.kimzing.netty.rpc.protocol.netty.serial.ISerializer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class RpcDecode extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {

        // 如果比头的长度都小(头的长度为14)，是不是就没有内容
        if (in.readableBytes() < 14) {
            return;
        }
        in.markReaderIndex();

        byte serialType = in.readByte();
        byte reqType = in.readByte();
        long requestId = in.readLong();
        int dataLength = in.readInt();
        // 如果剩余读取的字节小于dataLength
        if (in.readableBytes() < dataLength) {
            in.resetReaderIndex();
            return;
        }

        byte[] content = new byte[dataLength];
        in.readBytes(content);


        Header header = new Header(serialType, reqType, requestId, dataLength);

        ISerializer serializer = ISerializer.getSerializer(serialType);

        switch (reqType) {
            case (byte)1:
                // 反序列化
                RequestBody requestBody = serializer.deserialize(content, RequestBody.class);
                // 封装成RpcProtocal对象
                Protocol<RequestBody> protocol = new Protocol<>();
                protocol.setHeader(header);
                protocol.setBody(requestBody);
                out.add(protocol);
                break;
            case (byte)2:
                // 反序列化
                ResponseBody rpcResponseBody = serializer.deserialize(content, ResponseBody.class);
                // 封装成RpcProtocal对象
                Protocol<ResponseBody> protocal = new Protocol<>();
                protocal.setHeader(header);
                protocal.setBody(rpcResponseBody);
                out.add(protocal);
                break;
            default:
                break;
        }
    }
}
