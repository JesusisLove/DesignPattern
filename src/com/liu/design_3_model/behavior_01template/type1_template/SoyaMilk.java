package com.liu.design_3_model.behavior_01template.type1_template;

public abstract class SoyaMilk {
    // 这是模版方法，将其定义成final，不让子类覆盖该方法
    final void makeSoyMilk() {
        // 豆浆的制作过程
        // 1.选料
        select();
        // 2.加料
        addCondiments();
        // 3.浸泡
        soak();
        // 4.研磨
        grind();
    }


    // 选材料
    void select() {
        System.out.println("第一步：选择黄豆");
    }

    // 添加不同的配料，在各个子类中具体实现
    abstract void addCondiments();

    // 浸泡
    void soak() {
        System.out.println("第三步：浸泡黄豆");
    }

    // 研磨
    void grind() {
        System.out.println("第四步：研磨黄豆");
    }
}
