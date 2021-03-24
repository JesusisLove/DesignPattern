package com.liu.design_3_model.structure_05Facade.case1_Theater;

public class Screen {
    // 使用单例模式之饿汉式
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Screen is on...");
    }

    public void off() {
        System.out.println("Screen is off...");
    }

    public void up() {
        System.out.println("Screen is up...");
    }

    public void down() {
        System.out.println("Screen is down...");
    }
}
