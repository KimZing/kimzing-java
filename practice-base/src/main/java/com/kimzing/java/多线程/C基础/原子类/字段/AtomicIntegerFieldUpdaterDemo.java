package com.kimzing.java.多线程.C基础.原子类.字段;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 15:10
 */
public class AtomicIntegerFieldUpdaterDemo {

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<Student> age = AtomicIntegerFieldUpdater.newUpdater(Student.class, "age");
        System.out.println(age.getAndIncrement(new Student("kim", 12)));
    }

}


class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    // 必须要public volatile修饰
    public volatile int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}