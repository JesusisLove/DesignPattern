package com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.flyStrategy;

public class HightFly implements IStrategyFly{
    @Override
    public void fly() {
        System.out.println("飞得高");
    }
}