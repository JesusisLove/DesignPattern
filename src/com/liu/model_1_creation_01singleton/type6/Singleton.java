package com.liu.model_1_creation_01singleton.type6;

// 单例模式（双重检查）
/*
* 构造器私有化（目的是防止new对象）
* 类的内部创建对象
* 向外暴露一个静态的公共方法：getInstance
* */
public class Singleton {

    private static volatile Singleton instance;
    private Singleton() {}

    // 提供一个静态的共有方法，假如双重检查代码，解决线程安全问题，同时解决懒加载的问题
    public static Singleton getInstance() {//public final static Singleton getInstance() {
        if (instance == null) {//⭐️⭐️⭐️⭐️　执行双重检查的第①次判断　 ⭐️⭐️⭐️
            synchronized(Singleton.class) {
                if (instance == null) {//⭐️⭐️⭐️⭐️　执行双重检查②　⭐️⭐️⭐️
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
