package com.liu.model_1_creation_02factory.pizzaSale_01_NG.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("正在给GreekPizza准备原材料...");
    }
}
