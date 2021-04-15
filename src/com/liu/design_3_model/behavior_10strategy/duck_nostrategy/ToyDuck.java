package com.liu.design_3_model.behavior_10strategy.duck_nostrategy;

public class ToyDuck extends AbstractDuck {
    public ToyDuck(String color, String kind) {
        super(color, kind);
    }

    @Override
    public void display() {
        System.out.println("～～这是玩具鸭～～");
        cry();
        fly();
        swin();
    }


    /* 本案例的传统设计模式的不足之处在于：玩具鸭要重写父类的所有方法 */
    @Override
    public void cry() {
        System.out.println("～～玩具鸭不会叫～～");
    }

    @Override
    public void fly() {
        System.out.println("～～玩具鸭不会飞～～");
    }

    @Override
    public void swin() {
        System.out.println("～～玩具鸭不会游泳～～");
    }
}
