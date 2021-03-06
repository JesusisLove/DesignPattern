package com.liu.model_1_creation_singleton_type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 = singleton2 is: " + singleton1.equals(singleton2));

        System.out.println("singleton1 的哈希值是: " + singleton1.hashCode());
        System.out.println("singleton2 的哈希值是: " + singleton2.hashCode());
    }

    /*
    * 饿汉式（静态常量）优缺点说明
    * 1）优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题
    * 2）缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从开始至终从未使用过这个实例，则会造成内存的浪费
    * 3）结论：这种单例模式可用，但是可能造成内存浪费
    * */
}
