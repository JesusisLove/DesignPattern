package com.liu.design_3_model.behavior_01template.type2_hook2;

public abstract class AbstractSoyaMilk {
    // 这是模版方法，将其定义成final，不让子类覆盖该方法
    final void makeSoyMilk() {
        // 豆浆的制作过程
        // 1.选料
        select();// 如果子类重写了select()方法，那么，select()也会成为钩子方法
        // 2.利用钩子方法withCondiments()来决定，是否要加料配料
        addCondiments();
        // 3.浸泡
        soak();//如果子类重写了soak()方法，那么，soak()也会成为钩子方法
        // 4.研磨
        grind();//如果子类重写了grind()方法，那么，grind()也会成为钩子方法
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

    // 定义一个钩子方法，钩子方法决定是否要添加配料
//    boolean withCondiments() {
//        return true;
//    }
    /* 补充：钩子方法的目的在于，在父类中定义空方法作为默认的方法，子类重写父类的方法做子类业务逻辑的具体实现*/

}
