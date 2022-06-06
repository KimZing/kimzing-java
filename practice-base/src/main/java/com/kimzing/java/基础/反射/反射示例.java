package com.kimzing.java.基础.反射;

import java.util.Arrays;

/**
 * 反射操作：包、构造方法、属性、函数、注解、接口、父类.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/2 20:50
 */
public class 反射示例 {

    public static void main(String[] args) {
        Class<User> clazz = User.class;
        System.out.println(clazz.getPackage().getName());
        System.out.println("获取所有公开的构造方法");
        System.out.println(clazz.getConstructors().length);
        System.out.println("获取所有构造方法");
        System.out.println(clazz.getDeclaredConstructors().length);
        System.out.println("获取所有公开的方法");
        // 普通的get只能拿到所有对用户可见的元素，包含其父类
        Arrays.stream(clazz.getMethods()).forEach(s -> System.out.println(s.getName()));
        System.out.println("获取所有方法，仅自身");
        // Declared代表所有对应的元素，忽视访问权限，但不包含父类
        Arrays.stream(clazz.getDeclaredMethods()).forEach(s -> System.out.println(s.getName()));
    }

}

abstract class Person {
    public abstract void sayHello(String hello);

    public void run() {
        System.out.println("Just Run");
    }
}

class User extends Person{
    private User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;

    public String getName(String name) {
        return name;
    }

    private void print() {
        System.out.println("print");
    }

    @Override
    public void sayHello(String hello) {
        System.out.println("Hello " + hello);
    }

}
