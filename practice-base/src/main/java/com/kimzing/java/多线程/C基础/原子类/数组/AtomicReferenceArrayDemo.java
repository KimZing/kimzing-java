package com.kimzing.java.多线程.C基础.原子类.数组;

import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 14:50
 */
public class AtomicReferenceArrayDemo {

    public static void main(String[] args) {
        AtomicReferenceArray<Object> objectAtomicReferenceArray = new AtomicReferenceArray<>(2);
        System.out.println(objectAtomicReferenceArray.compareAndSet(1, null, new Student("kimzing", 12)));
        System.out.println(objectAtomicReferenceArray.get(1));
    }

}

class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;

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
