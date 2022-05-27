package com.kimzing.java.多线程.C基础.原子类.字段;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 有版本号的引用类型.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/5/27 15:42
 */
public class AtomicStampedReferenceDemo {

    public static void main(String[] args) {
        User user = new User(123123);
        AtomicStampedReference<User> stamped = new AtomicStampedReference<User>(user, 1);
        stamped.compareAndSet(user, new User(1234567), 1, 3);
        System.out.println(stamped.getReference().getMoney());
    }

}

class User {

    public User(int money) {
        this.money = money;
    }

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
