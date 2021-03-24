package com.liu.design_3_model.structure_05Facade.case1_Theater;

public class Light {
    // 使用单例模式之饿汉式
    private static Light instance = new Light();

    public static Light getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Light is on...");
    }

    public void off() {
        System.out.println("Light is off...");
    }

    public void bright() {
        System.out.println("Light is bright...");
    }

    public void dark() {
        System.out.println("Light is dark...");
    }
}
