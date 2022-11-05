package com.kimzing.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufUtil;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/5 17:53
 */
public class ReadByteBuf {

    public static void main(String[] args) {
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer();
        buffer.writeBytes(new byte[]{
            0, 0, 0, 1, 0, 0, 0, 0});
        // 读取一个字节
        buffer.readBytes(new byte[3]);
        print(buffer);
    }

    private static void print(ByteBuf buffer) {
        System.out.println("read:" + buffer.readerIndex());
        System.out.println("write:" + buffer.writerIndex());
        System.out.println("capacity:" + buffer.capacity());
        System.out.println("maxCapacity:" + buffer.maxCapacity());
        System.out.println();
        StringBuilder stringBuilder = new StringBuilder();
        ByteBufUtil.appendPrettyHexDump(stringBuilder, buffer);
        System.out.println(stringBuilder);
    }

}
