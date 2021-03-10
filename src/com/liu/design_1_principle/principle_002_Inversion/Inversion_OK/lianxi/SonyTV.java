package com.liu.design_1_principle.principle_002_Inversion.Inversion_OK.lianxi;

import com.liu.design_1_principle.principle_002_Inversion.Inversion_OK.lianxi.ITV;

public class SonyTV implements ITV{
    public void play() {
        System.out.println("Sony TV is turned on...");
    }
    public void stop() {
        System.out.println("Sony TV is turned off...");
    }
}
