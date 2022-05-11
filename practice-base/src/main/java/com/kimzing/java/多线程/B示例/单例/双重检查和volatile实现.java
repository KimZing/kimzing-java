package com.kimzing.java.多线程.B示例.单例;

/**
 * 基于双重检查锁定和volatile实现.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/1/26 17:19
 */
public class 双重检查和volatile实现 {

    private volatile static 双重检查和volatile实现 instance;

    private 双重检查和volatile实现() {
    }

    public static  双重检查和volatile实现 getInstance() {
        // 在外层判断主要是为了在第一次初始化之后，不用再走sync流程，会影响效率。
        if (instance == null) {
            synchronized (双重检查和volatile实现.class) {
                if (instance == null) {
                    // 不加volatile时，可能会重排序。A线程执行完，申请内存，引用赋值，但并没有初始化，会导致B线程使用未初始化的实例
                    instance = new 双重检查和volatile实现();
                }
            }
        }
        return instance;
    }

}
