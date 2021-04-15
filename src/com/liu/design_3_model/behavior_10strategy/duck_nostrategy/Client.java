package com.liu.design_3_model.behavior_10strategy.duck_nostrategy;

public class Client {
    public static void main(String[] args) {
        AbstractDuck waterDuck = new WaterDuck("水鸭","绿色");
        waterDuck.display();
        AbstractDuck toyDuck = new ToyDuck("玩具鸭","黄色");
        toyDuck.display();
        AbstractDuck beijingDuck = new BeijingDuck("北京鸭","泥土色");
        beijingDuck.display();
    }
}
