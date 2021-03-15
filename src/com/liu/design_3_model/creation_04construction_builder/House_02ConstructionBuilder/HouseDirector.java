package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

// 建造者模式四个基本角色之---指挥者：HouseDirector（负责按照一定的流程来盖房子，返回房子）
/* 盖房子的施工单位（拿宝马来说，组装宝马的生产厂家）*/
public class HouseDirector {
    HouseBulider houseBulider = null;// 盖楼抽象方案（宝马抽象生产线，是具体生产线的父类）

    // 方式一：通过构造器初始化houseBulider
    public HouseDirector(HouseBulider houseBulider) {
        this.houseBulider = houseBulider;
    }

    // 方式二：通过setter方法初始化houseBulider
    public void setHouseBulider(HouseBulider houseBulider) {
        this.houseBulider = houseBulider;
    }

    // 把如何盖房子，怎么盖房子，这样一个任务交给指挥者：HouseDirector
    public House constructHouse() {// 这里是生产车间
        houseBulider.buildBasic();
        houseBulider.buildWalls();
        houseBulider.roofed();
        return houseBulider.doDelivery();
    }
}
