package com.liu.design_3_model.creation_01singleton.type8;

public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("------- 线程安全的懒汉式模式 （静态内部类 推荐使用✅）-------");
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println("singleton1 = singleton2 is: " + singleton1.equals(singleton2));

        System.out.println("singleton1 的哈希值是: " + singleton1.hashCode());
        System.out.println("singleton2 的哈希值是: " + singleton2.hashCode());
        singleton1.sayOK();
        singleton2.sayOK();
    }

    /*
    * 饿汉式（枚举）优缺点说明
    * 1）借助JDK1.5中添加的枚举来实现单例模式，不仅能避免多线程同步问题，
    *    而且还能防止反序列化重新创建新的对象
    * 2）这种方式是Effective Java作者Josh Bloch提倡的方式
    * 3）结论：在实际开发中，非常推荐使用这种方式。✔︎
    * */
}
