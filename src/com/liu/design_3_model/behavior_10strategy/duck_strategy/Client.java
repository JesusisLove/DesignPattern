package com.liu.design_3_model.behavior_10strategy.duck_strategy;

import com.liu.design_3_model.behavior_10strategy.duck_strategy.context.AbstractDuck;
import com.liu.design_3_model.behavior_10strategy.duck_strategy.context.BeijingDuck;
import com.liu.design_3_model.behavior_10strategy.duck_strategy.context.ToyDuck;
import com.liu.design_3_model.behavior_10strategy.duck_strategy.context.WildDuck;

public class Client {

    public static void main(String[] args) {
        // 野生鸭子：在野生鸭子的类里面，封装类野生鸭子的行为对象【飞得高，游得快】
        AbstractDuck wild = new WildDuck();
        wild.display();

        // 北京鸭子：在北京鸭子的类里面，封装类北京鸭子的行为对象【不会飞，游泳速度一般般】
        AbstractDuck beijing = new BeijingDuck();
        beijing.display();

        // 玩具鸭子：在玩具鸭子的类里面，封装类玩具鸭子的行为对象【不会飞，不会游】
        AbstractDuck toy = new ToyDuck();
        toy.display();
    }
}
