package com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.swimStrategy;

public class FastSwim implements IStrategySwim {
    @Override
    public void swim() {
        System.out.println("游泳速度很快");
    }
}