package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

// 建造者模式四个基本角色之---抽象的建造者：HouseBulider
public abstract class HouseBulider {
    // 建造者模式四个基本角色之---产品：House
    public House house = new House();

    // 盖房子的各个环节的抽象方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 把盖好了的房子交付（给客户等）。至于如何盖房子，怎么盖，则是交由HouseDirector去具体实施
    public House doDelivery() {
        return house;
    }
}
