package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

// 建造者模式四个基本角色之---指挥者：HouseDirector（负责按照一定的流程来盖房子，返回房子）
public class HouseDirector {
    HouseBulider houseBulider = null;

    // 方式一：通过构造器初始化houseBulider
    public HouseDirector(HouseBulider houseBulider) {
        this.houseBulider = houseBulider;
    }

    // 方式二：通过setter方法初始化houseBulider
    public void setHouseBulider(HouseBulider houseBulider) {
        this.houseBulider = houseBulider;
    }

    // 把如何盖房子，怎么盖房子，这样一个任务交给指挥者：HouseDirector
    public House constructHouse() {
        houseBulider.buildBasic();
        houseBulider.buildWalls();
        houseBulider.roofed();
        return houseBulider.doDelivery();
    }
}
