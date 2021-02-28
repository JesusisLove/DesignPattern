package com.liu.principle_003_Liskov.Liskov_NG;

public class MainCls {
    public static void main(String[] arg) {
        SupA a = new SupA();
        System.out.println("11 - 3 = " + a.function1(11,3));
        System.out.println("-----------------------------");
        SubB b = new SubB();
        System.out.println("11 - 3 = " + b.function1(11,3));
        System.out.println("11 - 3 = " + b.function2(11,3));
    }
}
