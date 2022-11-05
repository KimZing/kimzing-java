package com.kimzing.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/5 17:53
 */
public class EmptyByteBuf {

    public static void main(String[] args) {
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer();
        print(buffer);
    }

    private static void print(ByteBuf buffer) {
        System.out.println("read:" + buffer.readerIndex());
        System.out.println("write:" + buffer.writerIndex());
        System.out.println("capacity:" + buffer.capacity());
        System.out.println("maxCapacity:" + buffer.maxCapacity());
        System.out.println();
    }

}
