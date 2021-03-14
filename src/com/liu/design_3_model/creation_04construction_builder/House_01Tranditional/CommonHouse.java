package com.liu.design_3_model.creation_04construction_builder.House_01Tranditional;

public class CommonHouse extends AbsHouse {

    @Override
    public void buildBase() {
        System.out.println("给CommonHouse打地基。。。");
    }

    @Override
    public void buildWalls() {
        System.out.println("给CommonHouse砌墙。。。");
    }

    @Override
    public void roofed() {
        System.out.println("给CommonHouse封顶。。。");
    }
}
