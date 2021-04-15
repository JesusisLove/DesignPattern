package com.liu.design_3_model.behavior_10strategy.duck_strategy.context;

import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.flyStrategy.CanNotFly;
import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.swimStrategy.NormalSwim;

public class BeijingDuck extends AbstractDuck{

    /* 在构造器里，初始化北京鸭的行为 ※透过在父类里面定义的策略接口，在子类里面控制它具体的策略行为
     * 北京鸭子的行为是
     *     不会飞---透过IStategyFly这个行为接口，去具体使用CanNotFly策略行为类
     *     游得速度一般般---透过IStategySwim这个行为接口，去具体使用NormalSwim策略行为类
     * */
    public BeijingDuck() {
        // 北京鸭子，是飞不起来的鸭子
        flyStrategy = new CanNotFly();
        // 北京鸭子，游泳速度一般般
        swimStrategy = new NormalSwim();
    }

    // 显示北京鸭子的信息
    @Override
    public void display() {
        System.out.println("------- 这是北京鸭子 -------");
        flyStrategy.fly();
        swimStrategy.swim();
    }
}