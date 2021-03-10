package com.liu.design_3_model.creation_02factory.pizzaSale_01_NG.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("正在给CheesePizza准备原材料...");
    }
}
