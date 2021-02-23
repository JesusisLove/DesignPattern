package com.liu.principle_001_Segregation_NG;

 // 要求A通过Interface1依赖（使用）B，且A只用到Interface1接口的 1，2，3
 public class A {
    public void depends1 (Interface1 i) {
        System.out.println("principle_001_Segregation_NG:A depends on → " + i.operateion1());
    }
    public void depends2 (Interface1 i) {
        System.out.println("principle_001_Segregation_NG:A depends on → " + i.operateion2());
    }
    public void depends3 (Interface1 i) {
        System.out.println("principle_001_Segregation_NG:A depends on → " + i.operateion3());
    }
}
