package com.kimzing.java.基础.集合.基础结构.链表.双向链表;

import java.util.LinkedList;

/**
 * 双向链表.
 * <p>
 *     1. 空间可以不连续
 *     2. 不支持下表访问
 *     3. 增删快
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/1 14:34
 */
public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("a");
        list.addFirst("b");
        // getFirst
        System.out.println(list.element());
        System.out.println(list.size());
        list.remove("b");
        System.out.println(list.element());
        System.out.println(list.size());
    }
}


class KimList<E> {

    private static class Node<E> {

        public Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

        E item;
        Node<E> prev;
        Node<E> next;
    }
}
