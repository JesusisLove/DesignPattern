package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.decorator;

import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Decorator;
import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Drink;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDescription("调味品：牛奶");
        // 牛奶调味品的价格
        setPrice(0.50f);
    }
}
