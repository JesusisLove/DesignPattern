package com.liu.model_1_creation_01singleton.type4;

// 懒汉式（线程安全，同步方法）
/*
* 构造器私有化（目的是防止new对象）
* 类的内部创建对象
* 向外暴露一个静态的公共方法：getInstance
* */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    // ⭐⭐⭐⭐提供一个共有的静态方法，当使用到该方法是，才去创建instance，同时，为例线程安全，该方法添加了synchronized关键字⭐⭐⭐
    public static synchronized Singleton getInstance() {//public final static Singleton getInstance() {

        // ⭐⭐⭐⭐这里是线程不安全区域，但是，加上synchronized关键字，线程就被要求排队了
        // 当线程t1执行的判断条件，要去执行但是还没有执行new Singleton()的当儿，线程t2要进来，一看synchronized，t2就要去排队，
        // 等t1执行完后，t2才进来
        // 因为t1执行了new Singleton()，当t2进来执行if (instance == null) 是，因为已经有了实例了，所以t2就不再去执行new Sington()了，
        // 这样，就又可以保证对象的单例形式，就达到了单例的线程安全标准了⭐⭐⭐⭐
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
