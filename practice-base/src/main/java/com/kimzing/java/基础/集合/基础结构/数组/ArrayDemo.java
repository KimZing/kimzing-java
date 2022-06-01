package com.kimzing.java.基础.集合.基础结构.数组;

/**
 * 数组结构的基本示例.
 * <p>
 *     1. 内存地址连续
 *     2. 通过下表访问，访问速度快
 *     3. 长度变化时的操作对性能影响较大，需要复制
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 14:10
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println(arr1[0]);
        String[] arr2 = new String[]{"1","2","3","4","5"};
        System.out.println(arr2[2]);
        char[] arr3 = {'a', 'b', 'c'};
        System.out.println(arr3[1]);
    }

}
