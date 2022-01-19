package com.kimzing.java.特性.泛型.示例;

/**
 * 泛型类定义.
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/3/27 12:27
 */
public class GenericDemo_1<T> {

    private T param;

    public GenericDemo_1(T param) {
        this.param = param;
    }

    public T getParam() {
        return param;
    }

    public static void main(String[] args) {
        GenericDemo_1<String> hello = new GenericDemo_1<>("Hello");
        GenericDemo_1<Integer> num = new GenericDemo_1<>(123);
    }

}
