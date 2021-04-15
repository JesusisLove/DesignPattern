package com.liu.design_3_model.behavior_10strategy.duck_nostrategy;

public class WildDuck extends AbstractDuck {
    public WildDuck(String color, String kind) {
        super(color, kind);
    }

    @Override
    public void display() {
        System.out.println("～～这是野鸭～～");
        cry();
        fly();
        swin();
    }
}
