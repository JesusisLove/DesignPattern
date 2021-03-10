package com.liu.design_3_model.creation_01singleton.type3;

// 懒汉式（线程不安全）
/*
* 构造器私有化（目的是防止new对象）
* 类的内部创建对象
* 向外暴露一个静态的公共方法：getInstance
* */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    // ⭐⭐⭐⭐提供一个共有的静态方法，当使用到该方法是，才去创建instance，这就是懒汉式⭐⭐⭐
    public static Singleton getInstance() {//public final static Singleton getInstance() {

        // ⭐⭐⭐⭐这里是线程不安全区域，当线程t1执行的判断条件，要去执行但是还没有执行new Singleton()的当儿，线程t2也进来了，
        // 而且执行了new Singleton()，这样就产生了多个实例，就不是单例了⭐⭐⭐⭐
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
