package com.liu.model_1_creation_01singleton.type5;

public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("------- 线程安全的懒汉式模式 （同步代码块）-------");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 = singleton2 is: " + singleton1.equals(singleton2));

        System.out.println("singleton1 的哈希值是: " + singleton1.hashCode());
        System.out.println("singleton2 的哈希值是: " + singleton2.hashCode());
    }

    /*
    * 饿汉式（线程安全）优缺点说明
    * 1）优点：解决了线程安全问题
    * 2）缺点：因着线程同步带来线程排队的问题，而且关键字synchronized还写在了代码块里，
    *         这就更加大大降低了程序的执行效率
    * 3）结论：在实际开发中，不能使用这种方式。
    * */
}
