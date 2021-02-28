package com.liu.principle_004_OpenClose.OpenClose_OK;
/* 对【扩展开放，修改关闭】的原则的详细总结，参看
    ---→在User_GraphicEditor.java里的总结
*/
public class Provider_Pentagon extends Provider_Shape {
    @Override
    public void draw() {
        System.out.println("Draw Pentagon");
    }
}
