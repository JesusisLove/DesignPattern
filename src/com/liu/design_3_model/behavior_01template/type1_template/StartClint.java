package com.liu.design_3_model.behavior_01template.type1_template;

public class StartClint {
    public static void main(String[] args) {
        System.out.println("------- 制作黑豆豆浆 -------");
        SoyaMilk soyaMilkBlackBean = new BlackBeanSoyaMilk();
        soyaMilkBlackBean.makeSoyMilk();

        System.out.println("------- 制作花生豆浆 -------");
        SoyaMilk soyaMilkPeanut = new PeanutSoyaMilk();
        soyaMilkPeanut.makeSoyMilk();
    }
}
