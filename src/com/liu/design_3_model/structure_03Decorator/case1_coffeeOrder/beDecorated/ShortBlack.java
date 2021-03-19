package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.beDecorated;

import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Coffee;

public class ShortBlack extends Coffee {

    public ShortBlack() {
        setDescription("Short黑咖啡");
        setPrice(4.90f);
    }
}
