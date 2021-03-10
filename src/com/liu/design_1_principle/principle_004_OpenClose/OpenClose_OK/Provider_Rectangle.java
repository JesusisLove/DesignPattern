package com.liu.design_1_principle.principle_004_OpenClose.OpenClose_OK;

import com.liu.design_1_principle.principle_004_OpenClose.OpenClose_OK.Provider_Shape;

/* 对【扩展开放，修改关闭】的原则的详细总结，参看
    ---→在User_GraphicEditor.java里的总结
*/
public class Provider_Rectangle extends Provider_Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
