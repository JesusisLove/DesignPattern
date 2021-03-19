package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.decorator;

import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Decorator;
import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Drink;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDescription("调味品：巧克力");
        // 巧克力调味品的价格
        setPrice(0.80f);
    }
}
