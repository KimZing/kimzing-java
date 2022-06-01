package com.kimzing.java.基础.集合.Set;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * 本质上是将数据保持在 HashMap中 key就是我们添加的内容，value就是我们定义的一个Object对象
 * 特点
 * 底层数据结构是哈希表，HashSet的本质是一个"没有重复元素"的集合，他是通过HashMap实现的.HashSet中
 * 含有一个HashMap类型的成员变量 map
 *
 * <p>
 *     搞懂HashMap就可以了
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 16:41
 */
public class HashSetTreeSetDemo {

    public static void main(String[] args) {
        //构造函数中初始化内部变量 map = new HashMap<>();
        HashSet<Object> set = new HashSet<>();
        set.add(1);

        // TreeSet利用TreeMap实现的，学习TreeMap即可
        // 基于IreeMap的 NavigableSet实现。使用元素的自然顺序对元素进行排序，或者根据创建 set 时提供的
        // Comparator进行排序，具体取决于使用的构造方法。
        TreeSet<Object> objects = new TreeSet<>();
        objects.add(1);
    }

}
