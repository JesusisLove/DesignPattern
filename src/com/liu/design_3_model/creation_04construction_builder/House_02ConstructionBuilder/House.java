package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

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
