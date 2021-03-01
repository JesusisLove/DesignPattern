package com.liu.principle_004_OpenClose.OpenClose_OK;
/* 对【扩展开放，修改关闭】的原则的详细总结，参看
    ---→在User_GraphicEditor.java里的总结
*/
public class MainCls {
    public static void main(String[] arg) {

        // 生成一个使用方的对象
        User_GraphicEditor graphicEditor = new User_GraphicEditor();
        graphicEditor.drawShape(new Provider_Rectangle());
        graphicEditor.drawShape(new Provider_Circle());

        /* 因业务需要，对程序进行扩展：要程序实现可以画三角形 的这么一个业务
        *  只需要这样做即可
        *       扩展（追加）一个三角形类Triangle，继承Provider_Shap抽象类，实现抽象类的draw()方法
        *       扩展（追加）一个五角形类Pentagon，继承Provider_Shap抽象类，实现抽象类的draw()方法
        *       扩展（追加）一个梯形类Trapezoid，继承Provider_Shap抽象类，实现抽象类的draw()方法
        *       因为采用了设计模式的关闭原则，所有提供方User_GraphicEditer不需要任何修改
        * */
        graphicEditor.drawShape(new Provider_Triangle());
        graphicEditor.drawShape(new Provider_Pentagon());
        graphicEditor.drawShape(new Provider_Trapezoid());
    }
}
