package com.kimzing.java.基础.注解.演示;

import java.lang.reflect.Method;

/**
 * 注解测试.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/2 22:36
 */
public class AnnotationDemo {

    public static void main(String[] args) throws Exception {
        Class<Person> clazz = Person.class;
        KimInfo annotation = clazz.getAnnotation(KimInfo.class);
        Method method = clazz.getMethod(annotation.method());
        Person person = clazz.newInstance();
        method.invoke(person);
    }

}
