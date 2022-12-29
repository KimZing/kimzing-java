package com.kimzing.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

/**
 * 扩容机制.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/5 18:34
 */
public class CapacityByteBuf {

    public static void main(String[] args) {
        // 数据小于256, 那么容量为默认的256
        ByteBuf buffer1 = ByteBufAllocator.DEFAULT.buffer();
        buffer1.writeBytes(new byte[10]);
        print(buffer1); // 256
        // 数据大于256, 那么容量会直接扩容为两倍
        ByteBuf buffer2 = ByteBufAllocator.DEFAULT.buffer();
        buffer2.writeBytes(new byte[256 + 1]);
        print(buffer2); // 512
        // 数据的两倍大于4M，那么容量直接返回4M
        ByteBuf buffer3 = ByteBufAllocator.DEFAULT.buffer();
        buffer3.writeBytes(new byte[4*1024*1024/2 + 1]);
        print(buffer3); // 4194304
        // 数据的大小为4M，那么容量仍然为4M
        ByteBuf buffer4 = ByteBufAllocator.DEFAULT.buffer();
        buffer4.writeBytes(new byte[4*1024*1024]);
        print(buffer4); // 4194304
        // 数据大于4M，那么容量为原来大小加上4M
        ByteBuf buffer5 = ByteBufAllocator.DEFAULT.buffer();
        buffer5.writeBytes(new byte[4*1024*1024+1]);
        print(buffer5); // 8388608
    }

    public static void print(ByteBuf byteBuf) {
        System.out.println("容量:" + byteBuf.capacity());
        System.out.println("==========================");
    }

}
