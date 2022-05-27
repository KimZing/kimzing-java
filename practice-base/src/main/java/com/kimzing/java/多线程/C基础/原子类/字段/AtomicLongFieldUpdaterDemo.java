package com.kimzing.java.多线程.C基础.原子类.字段;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 15:10
 */
public class AtomicLongFieldUpdaterDemo {

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Student2> age = AtomicLongFieldUpdater.newUpdater(Student2.class, "money");
        System.out.println(age.getAndIncrement(new Student2("kim", 13123123123L)));
    }

}


class Student2 {

    public Student2(String name, long money) {
        this.name = name;
        this.money = money;
    }

    private String name;

    // 必须要public volatile修饰
    public volatile long money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}