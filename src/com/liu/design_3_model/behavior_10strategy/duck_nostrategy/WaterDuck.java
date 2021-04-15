package com.liu.design_3_model.behavior_10strategy.duck_nostrategy;

public class WaterDuck extends AbstractDuck {
    public WaterDuck(String color, String kind) {
        super(color, kind);
    }

    @Override
    public void display() {
        System.out.println("～～这是水鸭～～");
        cry();
        fly();
        swin();
    }
}
