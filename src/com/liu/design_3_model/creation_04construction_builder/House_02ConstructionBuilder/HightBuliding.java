package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

/* 这是盖摩天大厦的建造方式 （如拿宝马生产线来说，这是生产宝马航母的生产线）*/
public class HightBuliding extends HouseBulider {
    @Override
    public void buildBasic() {
        super.house.setBasic("打地基：100米");
        System.out.println("摩天大楼，打地基：100米");
    }

    @Override
    public void buildWalls() {
        super.house.setWall("砌墙：3米");
        System.out.println("摩天大楼，砌墙：3米");
    }

    @Override
    public void roofed() {
        super.house.setRoofed("封顶：留有停车场");
        System.out.println("摩天大楼封顶：留有停车场");
    }

    /*
    * 把普通房子的建造过程写在子类里面类，如 打地基，砌墙，封顶
    * 而产品的属性是封装在了House类里面了，这样就算是把产品的制作流程和产品本身分开了（解耦了）
    *  */
}
