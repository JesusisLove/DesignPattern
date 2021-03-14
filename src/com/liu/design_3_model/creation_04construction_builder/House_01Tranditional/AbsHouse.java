package com.liu.design_3_model.creation_04construction_builder.House_01Tranditional;

public abstract class AbsHouse {
    // 打地基
    public abstract void buildBase();
    // 砌墙
    public abstract void buildWalls();
    // 封顶
    public abstract void roofed();

    // 因为盖房子是有顺序的，所以定义build方法，把盖房子的建造顺序写在该方法里面
    public void doBuild() {
        buildBase();
        buildWalls();
        roofed();
    }
}
