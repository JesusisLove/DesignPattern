package com.liu.design_3_model.behavior_01template.type2_hook1;

public class StartClint {
    public static void main(String[] args) {
        System.out.println("------- 制作黑豆豆浆 -------");
        AbstractSoyaMilk soyaMilkBlackBean = new BlackBeanSoyaMilk();
        soyaMilkBlackBean.makeSoyaMilk();

        System.out.println("------- 制作花生豆浆 -------");
        AbstractSoyaMilk soyaMilkPeanut = new PeanutSoyaMilk();
        soyaMilkPeanut.makeSoyaMilk();

        System.out.println("------- 制作纯豆浆 -------");
        AbstractSoyaMilk soyaMilk = new SoyaMilkOnly();
        soyaMilk.makeSoyaMilk();
    }
}
