package com.kimzing.java.基础.注解.演示;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 执行类中的制定方法.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/2 22:37
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KimInfo {

    String method();

}
