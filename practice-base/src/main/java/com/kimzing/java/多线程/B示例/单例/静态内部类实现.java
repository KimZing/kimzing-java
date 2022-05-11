package com.kimzing.java.多线程.B示例.单例;

/**
 * 静态内部类.
 *
 * <p>
 *     之所以使用静态内部类而直接使用外层类本身，是因为静态内部类可以实现延时加载
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/1/26 17:37
 */
public class 静态内部类实现 {

    private static class Instance {
        private static Instance instance = new Instance();

        public void doSomething() {}
    }

    public static Instance getInstance() {
        return Instance.instance;
    }

}
