package com.kimzing.java.基础.集合.List;

import java.util.LinkedList;

/**
 * LinkedList是通过双向链表去实现的，他的数据结构具有双向链表的优缺点，既然是双向
 * 表，那么的它的顺序访问效率会非常高，而随机访问的效率会比较低，它包含一个非常重要的私有内部静态类：Node.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 16:14
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // 添加到尾部，是list接口定义的规范
        list.add(1);
        // 添加到头部，是linkedList自己的api，或者说是队列的api，实现了queue和deque
        list.push(2);

        // 通过遍历实现，根据index和size比较进行从头遍历或是尾部遍历
        System.out.println(list.get(1));

        // 查找到对应Node，修改，返回旧值
        System.out.println(list.set(1, 5));
        System.out.println(list);
    }

}
