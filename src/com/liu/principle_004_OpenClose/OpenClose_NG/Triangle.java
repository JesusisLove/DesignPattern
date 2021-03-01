package com.liu.principle_004_OpenClose.OpenClose_NG;
/* ＜新增需时要对程序做的修改＞
 * 如果我要画一个三角的图形（增加类业务需求），来看一下该Project的扩展性
 * 要添加一个三角形的类
 * 于此同时，还需要在类GraphicEditor.java（使用者）里添加一个执行画三角形drawTriangle()这么一个方法
 */
public class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
//        m_type = 1;
    }
}
