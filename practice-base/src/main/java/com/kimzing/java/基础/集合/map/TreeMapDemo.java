package com.kimzing.java.基础.集合.map;

import java.util.TreeMap;

/**
 * TreeMap内部使用红黑树做实现.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 17:08
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        // 会添加到红黑树中，根据红黑树的算法进行添加，变色、左旋右旋来达到自平衡
        treeMap.put("1", "2");
    }

}
