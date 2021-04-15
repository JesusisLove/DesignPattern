package com.liu.design_3_model.behavior_10strategy.duck_nostrategy;

public class BeijingDuck extends AbstractDuck {
    public BeijingDuck(String color, String kind) {
        super(color, kind);
    }

    @Override
    public void display() {
        System.out.println("～～这是北京鸭～～");
        cry();
        fly();
        swin();
    }

    @Override
    public void fly() {
        //super.fly();
        System.out.println("～～北京鸭不会飞～～");
    }
}
