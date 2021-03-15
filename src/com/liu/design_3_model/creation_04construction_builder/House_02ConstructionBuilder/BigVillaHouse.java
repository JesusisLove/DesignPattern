package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

/* 这是盖大别墅的建造方式 （如拿宝马生产线来说，这是生产宝马A6的生产线）*/
public class BigVillaHouse extends HouseBulider {
    @Override
    public void buildBasic() {
        super.house.setBasic("打地基：15米");
        System.out.println("盖别墅，打地基：15米");
    }

    @Override
    public void buildWalls() {
        super.house.setWall("砌墙：5米");
        System.out.println("盖别墅，砌墙：5米");
    }

    @Override
    public void roofed() {
        super.house.setRoofed("封顶：3米");
        System.out.println("盖别墅，封顶：2米，并留有天台");
    }
    /*
    * 把普通房子的建造过程写在子类里面类，如 打地基，砌墙，封顶
    * 而产品的属性是封装在了House类里面了，这样就算是把产品的制作流程和产品本身分开了（解耦了）
    *  */
}
