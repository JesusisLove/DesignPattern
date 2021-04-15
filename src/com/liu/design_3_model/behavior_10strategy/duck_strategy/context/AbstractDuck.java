package com.liu.design_3_model.behavior_10strategy.duck_strategy.context;

import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.flyStrategy.IStrategyFly;
import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.swimStrategy.IStrategySwim;

public abstract class AbstractDuck {
    // 将策略接口聚合到AbstractDuck类里（成员变量）
    IStrategyFly flyStrategy;   // 这是关于飞的行为策略
    IStrategySwim swimStrategy; // 这是关于游泳的行为策略

    public abstract void display();

}
