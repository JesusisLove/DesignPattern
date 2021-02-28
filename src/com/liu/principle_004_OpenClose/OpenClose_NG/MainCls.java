package com.liu.principle_004_OpenClose.OpenClose_NG;

public class MainCls {
    public static void main(String[] arg) {
        GraphicEditor g = new GraphicEditor();
        g.drawShap(new Rectangle());
        g.drawShap(new Circle());
        g.drawShap(new Triangle());

    }
}