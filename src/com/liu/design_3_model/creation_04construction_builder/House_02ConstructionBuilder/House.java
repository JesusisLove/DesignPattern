package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

// 建造者模式四个基本角色之---产品：House
/* 产品：房子（有可能是普通房子，有可能是摩天大楼，有可能是大别墅） （如拿宝马来说，有可能是A6宝马，有可能是M5宝马，有可能是航母宝马，总之，是宝马产品）*/
public class House {
    private String basic;
    private String wall;
    private String roofed;

    public void setBasic(String basic) {
        this.basic = basic;
    }
    public void setWall(String wall) {
        this.wall = wall;
    }
    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    public String getBasic() {
        return basic;
    }
    public String getWall() {
        return wall;
    }
    public String getRoofed() {
        return roofed;
    }
}
