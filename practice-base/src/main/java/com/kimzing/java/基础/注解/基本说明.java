package com.kimzing.java.基础.注解;

/**
 * 注解其实就是一种注释.可以声明在包、类、方法、字段、局部变量、方法参数上
 * 作用分类：
 * 1. 编写文档 @Param @Author @Since
 * 2. 代码说明：重点，利用反射进行操作  @Component
 * 3. 编译检查：@Override
 *
 * <p>
 * 属性：在接口中定义的抽象方法
 * 返回结果必须是如下类型
 * 1.基本数据类型
 * 2.String类型
 * 3.枚举类型
 * 4.注解
 * 5.以上类型的数组
 * 性赋值注意点：
 * 1.如果定义的属性时，使用default关键字给属性默认初始值，可以在使用注解时不赋值
 * 2.如果只有一个属性需要赋值，而且该属性的名称是value，那么在赋值时 value可以省略
 * 3.数组赋值的时候，值使用〔}包裹，如果数组中只有一个值，那么 {} 可以省略
 * </p>
 *
 * <p>
 *     JDK中给我们提供的4个元注解
 * 1.@Target:描述当前注解能够作用的位置
 * ElementType.TYPE:可以作用在类上
 * ElementType.METHOD:可以作用在方法上
 * ElementType.FIELD:可以作用在成员变量上
 *
 * 2.@Retention: 描述注解被保留到的阶段
 * SOURCE < CLASS < RUNTIME
 * SOURCE:表示当前注解只在代码阶段有效
 * CLASS:表示该注解会被保留到字节码阶段
 * RUNTIME:表示该注解会被保留到运行阶段 JVM
 * 自定义的注解一般使用RetentionPolicy.RUNTIME，在运行期进行操作
 *
 * 3.@Documented:描述注解是否被抽取到]avaDocapi中
 *
 * 4.@inherited:描述注解是否可以被子类继承
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/6/2 22:06
 */
// 自定义注解，使用@interface，其实注解就是一个集成Annotation的接口，所以接口的方法和属性在注解里也可以使用，语法格式是一致的。
public @interface 基本说明 {

    public String name();

    // 注解里面的方法是必须要有返回值的（）
    // public void age();

    // 只可以使用指定类型
    // Student stu();
}
