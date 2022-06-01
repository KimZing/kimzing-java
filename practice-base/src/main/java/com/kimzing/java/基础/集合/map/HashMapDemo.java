package com.kimzing.java.基础.集合.map;

import java.util.HashMap;

/**
 HashMap底层结构
 Jdk1.7及以前是采用数组+链表
 Jdk1.8之后 采用数组+链表 或者 数组+红黑树方式进行元素的存储
 存储在hashMap集合中的元素都将是一个Map.Entry的内部接口的实现

 // 默认的HashMap中数组的长度 16
 static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
 // HashMap中的数组的最大容量
 static final int MAXIMUM_CAPACITY=1 << 30;
 // 默认的扩容的平衡因子
 static final float DEFAULT_LOAD_FACTOR = 0.75f;
 // 链表转红黑树的 临界值
 static final int TREEIFY_THRESHOLD = 8；
 // 红黑树转链表的 临界值
 static final int UNTREEIFY_THRESHOLD= 6
 // 链表转红黑树的数组长度的临界值
 static final int MIN_TREEIFY CAPACITY = 64；
 // HashMap中的数组结构
 transient Node<K,V>[] table;
 // HashMap中的元素个数
 transient int size;
 // 对HashMap操作的次数
 transient int modCount;
 // 扩容的临界值
 int threshold;
 // 实际的扩容值
 final float loadFactor;
 */
public class HashMapDemo {

    /**
     * 源码中很多地方用到了局部变量赋值，可以学习，方便内部比较和赋值
     */

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        // key的hash会做二次hash，保证均匀。
        // 初始长度为16，源码中利用了长度-1与hash值进行与运算，得到数组的小标。 这同样要求长度必须为2的n次方，这样减一之后才能得到 01111111的结构
        // 数组中对应的下标位置也是存储元素的
        hashMap.put("key", "value");
    }

}
