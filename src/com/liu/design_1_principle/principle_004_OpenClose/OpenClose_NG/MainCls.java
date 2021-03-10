package com.liu.design_1_principle.principle_004_OpenClose.OpenClose_NG;

import com.liu.design_1_principle.principle_004_OpenClose.OpenClose_NG.Circle;
import com.liu.design_1_principle.principle_004_OpenClose.OpenClose_NG.GraphicEditor;
import com.liu.design_1_principle.principle_004_OpenClose.OpenClose_NG.Rectangle;
import com.liu.design_1_principle.principle_004_OpenClose.OpenClose_NG.Triangle;

public class MainCls {
    public static void main(String[] arg) {
        GraphicEditor g = new GraphicEditor();
        g.drawShap(new Rectangle());
        g.drawShap(new Circle());
        g.drawShap(new Triangle());
    }
}