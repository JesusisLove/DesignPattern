package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.decorator;

import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Decorator;
import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Drink;

public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDescription("调味品：豆浆");
        // 豆浆调味品的价格
        setPrice(0.60f);
    }
}
