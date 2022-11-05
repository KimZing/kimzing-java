package com.kimzing.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/5 17:53
 */
public class ReadInvalidByteBuf {

    public static void main(String[] args) {
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer();
        buffer.writeBytes(new byte[]{
            1, 1, 0, 1, 0, 0, 0, 0});
        // 标记当前读位置
        buffer.markReaderIndex();
        // 读取三个字节
        System.out.print(buffer.readByte());
        System.out.print(buffer.readByte());
        System.out.print(buffer.readByte());
        System.out.println();
        // 恢复读位置，再次读三个字节
        buffer.resetReaderIndex();
        System.out.print(buffer.readByte());
        System.out.print(buffer.readByte());
        System.out.print(buffer.readByte());
    }

}
