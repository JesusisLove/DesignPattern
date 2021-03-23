package com.liu.design_3_model.creation_01singleton.type2_EagerStaticBlock;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 = singleton2 is: " + singleton1.equals(singleton2));

        System.out.println("singleton1 的哈希值是: " + singleton1.hashCode());
        System.out.println("singleton2 的哈希值是: " + singleton2.hashCode());
    }

    /*
    * 饿汉式（静态代码块）优缺点说明
    * 1）优点：跟静态常量的饿汉式一样的
    * 2）缺点：跟静态常量的饿汉式一样的
    * 3）结论：这种单例模式可用，但是可能造成内存浪费
    * */
}
