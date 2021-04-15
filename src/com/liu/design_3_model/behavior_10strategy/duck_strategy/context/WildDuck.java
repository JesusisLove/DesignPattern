package com.liu.design_3_model.behavior_10strategy.duck_strategy.context;

import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.flyStrategy.HightFly;
import com.liu.design_3_model.behavior_10strategy.duck_strategy.strategy.swimStrategy.FastSwim;

public class WildDuck extends AbstractDuck{

    /* 在构造器里，初始化野生鸭的行为 ※透过在父类里面定义的策略接口，在子类里面控制它具体的策略行为
    * 野生鸭子的行为是
    *     飞得高---透过IStategyFly这个行为接口，去具体使用HightFly策略行为类
    *     游得块---透过IStategySwim这个行为接口，去具体使用FastSwim策略行为类
    * */
    public WildDuck() {
        // 野生鸭子，可以飞飞得很高
        flyStrategy = new HightFly();
        // 野生鸭子，游泳速度也很快
        swimStrategy = new FastSwim();
    }

    // 显示野生鸭子的信息
    @Override
    public void display() {
        System.out.println("------- 这是野鸭子 -------");
        flyStrategy.fly();
        swimStrategy.swim();
    }
}