package com.liu.design_3_model.creation_01singleton.type5_LazySynchStatic;

// 懒汉式（线程安全，同步代码块）
/*
* 构造器私有化（目的是防止new对象）
* 类的内部创建对象
* 向外暴露一个静态的公共方法：getInstance
* */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {//public final static Singleton getInstance() {
        if (instance == null) {
            //⚡️⚡️⚡️⚡️⚡️这种方案解决线程安全问题更是行不通，结论是不能使用！！！⚡️⚡️⚡️⚡️⚡
            synchronized(Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
