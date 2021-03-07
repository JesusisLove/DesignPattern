package com.liu.model_1_creation_01singleton_type6;

public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("------- 线程安全的懒汉式模式 （双重检查 推荐使用✅）-------");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 = singleton2 is: " + singleton1.equals(singleton2));

        System.out.println("singleton1 的哈希值是: " + singleton1.hashCode());
        System.out.println("singleton2 的哈希值是: " + singleton2.hashCode());
    }

    /*
    * 饿汉式（线程安全，双重检查）优缺点说明
    * 1）优点：即解决了线程安全问题，又解决了懒加载问题，更重要的是还解决了同步执行的效率问题
    * 2）缺点：无
    * 3）结论：在实际开发中，非常推荐使用这种方式。✔︎
    * */
}
