package com.liu.design_3_model.structure_05Facade.case1_Theater;

public class Projector {
    // 使用单例模式之饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector is on...");
    }

    public void off() {
        System.out.println("Projector is off...");
    }

    public void focuse() {
        System.out.println("Projector is focusing...");
    }

    public void zoom() {
        System.out.println("Projector is zooming...");
    }
}
