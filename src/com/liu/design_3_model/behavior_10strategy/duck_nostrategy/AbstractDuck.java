package com.liu.design_3_model.behavior_10strategy.duck_nostrategy;

public abstract class AbstractDuck {

    protected String color;
    protected String kind;

    public AbstractDuck(String kind, String color) {
        this.color = color;
        this.kind = kind;
    }

    public abstract void display();

    public void cry() {
        System.out.println(kind + "：在呱呱叫。。。" + "颜色： " + color);
    }

    public void fly() {
        System.out.println(kind + "：在噗噗飞。。。" + "颜色： " + color);
    }

    public void swin() {
        System.out.println(kind + "：在游泳。。。" + "颜色： " + color);
    }
}
