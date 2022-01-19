package com.kimzing.java.基础.异常.trywithresource;

import lombok.extern.java.Log;

/**
 * @author KimZing - kimzing@163.com
 * @date 2017/10/16 下午5:31
 * @desc 电脑.
 * <p>
 *     实现AutoCloseable接口，当使用try with reource语法时，可以自动关闭
 * </p>
 */
@Log
public class Computor implements AutoCloseable {

    public static void main(String[] args) {
        try (Computor computor = new Computor()) {
            computor.say();
        }
    }

    @Override
    public void close() {
        log.info("computor is closing!");
    }

    public void say() {
        log.info("I am Computor");
    }

}
