package com.liu.design_3_model.structure_05Facade.case1_Theater;

// 爆米花机
public class Stereo {
    // 使用单例模式之饿汉式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo is on...");
    }

    public void off() {
        System.out.println("Stereo is off...");
    }

    public void volume() {
        System.out.println("Stereo is settingVolume...");
    }

}
