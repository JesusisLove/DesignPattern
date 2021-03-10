package com.liu.design_1_principle.principle_004_OpenClose.OpenClose_OK;

// 这是一个用于绘制图的一个类，即课件里提到的【使用方】
public class User_GraphicEditor {

    /* 对【扩展开放，修改关闭】的原则的详细总结：
    *  使用方：设计模式采用关闭修改的原则（意思是说，当提供方扩展某些功能时，使用的一方，不需要做任何添加修改）
    *  使用方之所以不需要做任何的修改是因为
    *       提供方（Circle，Pentagon，Rectangle，Triangle，Trapezoid类）都采用了继承抽象类Shape，并都实现类抽象类的draw方法
    *       使用方GraphicEditor只需要调用提供方的draw方法即可
    *  这样，就实达到了设计模式的【开放关闭】的原则
    *       提供方开放扩展（追加Triangle类，Trapezoid类，Pentagon类对程序进行类扩展）
    *       使用方关闭修改 (GraphicEditor类里，即便程序扩展类，该类不需要做任何修改👍)
    *
    * ※ 这也跟前面讲过的倒转依赖相类似 ---→package com.liu.principle_002_Inversion_OK;
    *   在【依赖倒转】原则里
    *       提供方是（weixin，Email，LINE，whatsApp）去实现CommunityReceiver
    *       使用方是Person类
    *   Person类接收消息的这个案例也遵循类【开放关闭】的原则
    *   再问一遍【开放关闭】原则（也可以说【开闭原则 ocp原则<OpenClosePrinciple>】）是什么意思！加深理解？
    *       就是提供方开放扩展，使用方关闭修改
    * */
    public void drawShape(Provider_Shape shape) {
        shape.draw();
    }
}
