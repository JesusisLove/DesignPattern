package com.liu.design_3_model.behavior_10strategy.duck_strategy.context;

import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.flyStrategy.CanNotFly;
import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.swimStrategy.CanNotSwim;

public class ToyDuck extends AbstractDuck{

    /* 在构造器里，初始化玩具鸭的行为 ※透过在父类里面定义的策略接口，在子类里面控制它具体的策略行为
     * 玩具鸭子的行为是
     *     不会飞---透过IStategyFly这个行为接口，去具体使用CanNotFly策略行为类
     *     不会游---透过IStategySwim这个行为接口，去具体使用CanNotSwim策略行为类
     * */
    public ToyDuck() {
        // 玩具鸭子，不能飞
        flyStrategy = new CanNotFly();
        // 玩具鸭子，不能游泳
        swimStrategy = new CanNotSwim();
    }

    // 显示玩具鸭子的信息
    @Override
    public void display() {
        System.out.println("------- 这是玩具鸭子 -------");
        flyStrategy.fly();
        swimStrategy.swim();
    }
}