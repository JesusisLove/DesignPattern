package com.liu.principle_001_Segregation_OK;

public class A {
    public void depends1 (Interface1 i) {
        System.out.println("A depends on:" + i.operateion1());
    }
    public void depends2 (Interface2 i) {
        i.operateion2();
    }
    public void depends3 (Interface3 i) {
        i.operateion3();
    }
}
