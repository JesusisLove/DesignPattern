package com.liu.design_1_principle.principle_004_OpenClose.OpenClose_OK;

/* 对【扩展开放，修改关闭】的原则的详细总结，参看
    ---→在User_GraphicEditor.java里的总结
*/
public class Provider_Trapezoid extends Provider_Shape {
    @Override
    public void draw() {
        System.out.println("Draw Trapezoid");
    }
}
