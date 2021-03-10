package com.liu.design_3_model.creation_01singleton.type3;

public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("------- 线程不安全的懒汉式模式 -------");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 = singleton2 is: " + singleton1.equals(singleton2));

        System.out.println("singleton1 的哈希值是: " + singleton1.hashCode());
        System.out.println("singleton2 的哈希值是: " + singleton2.hashCode());
    }

    /*
    * 饿汉式（线程不安全）优缺点说明
    * 1）优点：起到了LazyLoading的效果，但是，只能在单线程下使用.什么是懒加载：我用到对象才去创建，不用不创建
    * 2）缺点：如果在多线程下，一个线程进入了if (instance == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时，
    *        便会产生多个实例。所以在多线程环境下不可使用这种方式
    * 3）结论：在实际开发中，不要使用这种方式。
    * */
}
