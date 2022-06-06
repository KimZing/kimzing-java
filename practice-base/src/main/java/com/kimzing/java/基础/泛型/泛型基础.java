package com.kimzing.java.基础.泛型;

import java.util.List;

/**
 * 泛型基础.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/2 16:05
 */
public class 泛型基础 {

    public static void main(String[] args) {
        GenericDemo<String, String> demo1 = new GenericDemo<>();
        System.out.println(demo1.contact("aaa"));
        System.out.println(demo1.get(2));
    }

}

// 类上加泛型是泛型类，内部方法可以使用
class GenericDemo<E,R> {

    public E contact(E e) {
        return e;
    }

    // 泛型方法，可以和类的泛型声明重复，相互不影响
    public <E> E get(E e) {
        return e;
    }


    // 固定匹配, 泛型不会自动转型，外界传入时是不能传其他类型的。但可以用通配符来解决这个问题，也就是通配符是支持转型的，或者说是符合结构的
    public void print1(List<Number> list) {
        // 可以添加子类型，Integer具备Number的特征
        list.add(Integer.valueOf("2"));
        System.out.println(list);
    }

    // 无边界通配符
    public void print0(List<?> list) {
        System.out.println(list);
    }

    // 上边界通配符
    public void print2(List<? extends Number> list) {
        // 泛型是只认当前固定类型的（包含其继承）
        // 因为传入的一定是Number的任意子类，所以这里不能添加某个子类, 当然也不能添加父类
        // list.add(Integer.valueOf("2"));
        System.out.println(list);
    }

    // 下边界通配符
    public void print3(List<? super Number> list) {
        // 这里可以添加，因为最小传入的是Number类型，而Integer等封装类都是具备父类的属性的
        list.add(Integer.valueOf("2"));
        System.out.println(list);
    }

}

// 泛型接口，子类可以实现
interface GenericInterface<E1, E2> {
    E1 add(E1 e1, E2 e2);
}