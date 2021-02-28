package com.liu.principle_004_OpenClose.OpenClose_NG;

// 这是一个用于绘制图的一个类，即课件里提到的【使用方】
public class GraphicEditor {
    public void drawShap(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }

        /* ＜新增需时要对程序做的修改＞
         * 如果我要画一个三角的图形（增加类业务需求），来看一下该Project的扩展性
         * 要添加一个三角形的if语句判断
         */
        if(s.m_type == 3) {
            drawTriangle(s);
        }
    }

    private void drawRectangle(Shape shape) {
        System.out.println("Draw Rectangle");
    }

    private void drawCircle(Shape shape) {
        System.out.println("Draw Circle");
    }

    /* ＜新增需时要对程序做的修改＞
     * 如果我要画一个三角的图形（增加类业务需求），来看一下该Project的扩展性
     * 要添加一个执行画三角形的一个方法
     */
    private void drawTriangle(Shape shape) {
        System.out.println("Draw Triangle");
    }
}
