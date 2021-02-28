package com.liu.principle_003_Liskov.Liskov_OK;

public class SubB extends Base { // 分拆B类和A类之间的继承关系，从而降低类B类和A类之间的耦合性

// 本例子采用里氏替换原则，就分拆SupA和SubB直接的继承关系，让SubB和SubA都去继承Base类
    public int function1(int num1, int num2) {
        return num1 + num2;
    }
    public int function2(int a, int b) {
        return function1( a, b) + 10;
    }

    // 如果SubB需要使用SubA类的方法，使用组合关系
    private SubA a = new SubA();
    public int func3(int num1,int num2) {
        return a.function1(num1,num2);
    }
}
