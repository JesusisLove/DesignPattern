package com.liu.design_3_model.behavior_01template.type2_hook2;

// 纯豆浆，原汁原味不加任何配料
public class SoyaMilkOnly extends AbstractSoyaMilk {
    @Override
    void addCondiments() {
        // 因为不需要配料，这里就写成空方法，不做任何处理
        System.out.println("因为不需要配料，第二步省略");
    }
}
