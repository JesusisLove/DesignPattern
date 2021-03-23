package com.liu.design_3_model.creation_01singleton.type7_StaticClass;

// 单例模式（静态内部类）
/*
* 构造器私有化（目的是防止new对象）
* 类的内部创建对象
* 向外暴露一个静态的公共方法：getInstance
* */
public class Singleton {
    private static volatile Singleton instance;

    // 构造器私有化
    private Singleton() {}

    // 写一个静态内部类，该类中有一个静态属性Singleton
    //静态内部类有两个特点：1 外部类的装载不会导致静态内部类的装载
    //                  2 当加载静态内部类的时候，才去实例化Singleton类，
    //                    在装载Singleton类的时候，别的线程是无法进入的，
    //                    从而保障类线程的安全。
    private static class SingletonInstance { // ⭐️️️️⭐️⭐️⭐️　定义一个静态内部类　⭐️⭐️⭐️
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态的共有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
