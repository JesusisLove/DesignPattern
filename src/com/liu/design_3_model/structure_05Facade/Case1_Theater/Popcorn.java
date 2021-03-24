package com.liu.design_3_model.structure_05Facade.case1_Theater;

// 爆米花机
public class Popcorn {
    // 使用单例模式之饿汉式
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Popcorn is on...");
    }

    public void off() {
        System.out.println("Popcorn is off...");
    }

    public void pop() {
        System.out.println("Popcorn is poping...");
    }

}
