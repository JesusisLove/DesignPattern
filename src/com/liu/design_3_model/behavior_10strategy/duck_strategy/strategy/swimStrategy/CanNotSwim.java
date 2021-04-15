package com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.swimStrategy;

public class CanNotSwim implements IStrategySwim {
    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}