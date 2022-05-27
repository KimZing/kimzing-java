package com.kimzing.java.多线程.C基础.原子类.引用;

import java.util.concurrent.atomic.AtomicReference;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 15:06
 */
public class AtomicReferenceDemo {

    public static void main(String[] args) {
        AtomicReference<Student> atomicReference = new AtomicReference();
        Student kim = new Student("kim", 12);
        atomicReference.set(kim);
        atomicReference.compareAndSet(kim, new Student("kimzing", 18));
        System.out.println(atomicReference.get().getName());
        System.out.println(atomicReference.get().getAge());
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