package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.beDecorated;

import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Coffee;

public class Espresso extends Coffee {

    public Espresso() {
        setDescription("意大利咖啡");
        setPrice(6.00f);
    }
}
