package com.kimzing.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/5 18:52
 */
public class CreateByteBuf {

    // JVM: -Dio.netty.allocator.type={unpooled | polled}
    // byteBuf使用了池化技术， 池化技术简单的理解就是对象重复利用，减少GC，提高效率
    public static void main(String[] args) {
        // 由jvm管理内存
        ByteBuf heapBuffer = ByteBufAllocator.DEFAULT.heapBuffer();
        System.out.println(heapBuffer);
        // 堆外内存
        ByteBuf directBuffer = ByteBufAllocator.DEFAULT.directBuffer();
        System.out.println(directBuffer);
    }

}
