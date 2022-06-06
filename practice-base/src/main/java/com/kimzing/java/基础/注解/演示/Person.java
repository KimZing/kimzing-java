package com.kimzing.java.基础.注解.演示;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/2 22:38
 */
@KimInfo(method ="userName")
public class Person {

    public void userName() {
        System.out.println("My name is KimZing");
    }

}
