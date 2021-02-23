package com.liu.principle_002_Inversion_OK.lianxi;

public class PanasonicTV implements ITV{
    public void play() {
        System.out.println("Panasonic TV is turned on...");
    }
    public void stop() {
        System.out.println("Panasonic TV is turned off...");
    }
}
