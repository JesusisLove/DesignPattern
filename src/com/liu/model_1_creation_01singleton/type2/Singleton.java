package com.liu.model_1_creation_01singleton.type2;

// 饿汉式（静态代码块）
/*
* 构造器私有化（目的是防止new对象）
* 类的内部创建对象
* 向外暴露一个静态的公共方法：getInstance
* */
public class Singleton {
    // 1.构造器私有化，外部就不能创建该类的对象类
    private Singleton() {}

    // 2.在本类的内部创建实例对象
    private static Singleton instance;//private final static Singleton instance = new Singleton();
    // ⭐⭐⭐⭐️️️️在静态代码块中创建单例对象⭐⭐⭐
    static {
        instance = new Singleton();
    }
    // 3.提供一个共有的静态方法，返回实例对象
        public static Singleton getInstance() {//public final static Singleton getInstance() {
        return instance;
    }

}
