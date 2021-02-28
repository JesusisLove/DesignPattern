package com.liu.principle_003_Liskov.Liskov_NG;

public class SubB extends SupA { // B继承类A类，表示A和B直接有耦合性
    @Override
    public int function1(int num1, int num2) {//这里重写了SupA类里的function1方法
        return num1 + num2;
    }

    public int function2(int a, int b) {
        return function1( a, b) + 10;
    }
}
