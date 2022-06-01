package com.kimzing.java.基础.集合.List;

import java.util.ArrayList;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 15:37
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        // 内部都是通过System.arrayCopy来实现的操作

        // 调用无参构造，赋值一个空的数组
        ArrayList<Object> list = new ArrayList<>();
        // 无参构造第一次添加会先检查数组长度，不够就扩容，扩容容量为10(DEFAULT_CAPACITY)
        // 当到达11个元素时，会扩容原有容量的1.5倍，也就是15个
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // 直接通过数组下标
        System.out.println(list.get(1));

        //  设置新的值，返回原来的值
        System.out.println(list.set(1, 4));
        System.out.println(list);

        // 计算要移动的元素，然后通过arrayCopy来操作，减少size
        list.remove(1);

        // 在源码中add remove方法中，有一个modCount是用来实现failfast机制的，当使用iterator进行遍历时，会校验modCount和expectModCount是否相等，
        // 不相等时，说明有其他线程正在修改，此时会抛出ConcurrentModifyException来警告
    }

}
