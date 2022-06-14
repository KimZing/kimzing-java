package com.kimzing.java.基础.实验;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

/**
 * 参考学习地址：https://zhuanlan.zhihu.com/p/393902077.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/14 14:40
 */
public class 对象占用 {

    public static void main(String[] args) {
        /**
         * 不开启压缩时，32位对象头占用64bits，64为对象头占用128bits，开启压缩时，64位对象头占用96bits（markwork64bits没有变化，Klass Word从64变为了32）
         * Jdk1.8（开启了指针压缩）的64环境下，任何一个对象，啥也不做，只要声明一个类，那么它的内存占用就至少是96bits，也就是至少12字节。
         */
        System.out.println(ClassLayout.parseInstance(new NullObject()).toPrintable());
        /**
         OFF  SZ        TYPE DESCRIPTION               VALUE
         0    8        (object header: mark)     0x0000000000000001 (non-biasable; age: 0)
         8    4        (object header: class)    0x00060218
         12   4        (object alignment gap)
         Instance size: 16 bytes
         */
        /**
         * 以上输出，实际占用了16bytes，也就是128bits，这是因为虚拟机进行了填充进行内存对其，提高cpu的运算效率
         */

        /*===========================非空对象的占用NotNullObject==============*/
        /**
         * 分析：
         * NotNullObject实例本身占用16bytes（进行了填充）
         * 对象引用占用4bytes
         * int类型占用了4bytes
         * 然后额外的one对象自身占用16bytes
         *
         * 共40bytes
         *
         */
        // 实例占用 24byts
        System.out.println("================");
        System.out.println(ClassLayout.parseInstance(new NotNullObject()).toPrintable());
        // 所有相关内存占用
        System.out.println("================");
        System.out.println(GraphLayout.parseInstance(new NotNullObject()).toPrintable());
        // 对象的所有内存结果统计 40bytes
        System.out.println("================");
        System.out.println(GraphLayout.parseInstance(new NotNullObject()).toFootprint());


        System.out.println("================");
        System.out.println(ClassLayout.parseInstance(new HelloDemo()).toPrintable());
        System.out.println("================");
        System.out.println(GraphLayout.parseInstance(new HelloDemo()).toFootprint());
    }

}

class NullObject {

}

class NotNullObject {
    private NullObject one = new NullObject();
    private int a;
}

class HelloDemo {
    long a;
    int b;
    Object o=new Object();
}