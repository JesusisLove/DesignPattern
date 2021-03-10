package com.liu.design_3_model.creation_01singleton.type7;

public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("------- 线程安全的懒汉式模式 （静态内部类 推荐使用✅）-------");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 = singleton2 is: " + singleton1.equals(singleton2));

        System.out.println("singleton1 的哈希值是: " + singleton1.hashCode());
        System.out.println("singleton2 的哈希值是: " + singleton2.hashCode());
    }

    /*
    * 饿汉式（线程安全，静态内部类）优缺点说明
    * 1）这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
    * 2）静态内部类方式，在Singleton类被装载时并不会立即实例化，而是在需要实例化的时候，调用getInstance()方法，
    *    才会装载SingletonInstance类，从而完成Singleton的实例化。
    * 3）类的静态属性只会在第一次加载类的时候做初始化，且仅初始化一次，以后再怎么加载，都不会做初始化了。所以在这里，
    *    JVM帮助我们保证类线程的安全性，在类进行初始化的时候，别的线程是无法进入的。
    * 4）优点：避免类线程不安全，利用静态内部类特这一特性，实现延迟加载，效率很高
    * 5）结论：在实际开发中，非常推荐使用这种方式。✔︎
    * */
}
