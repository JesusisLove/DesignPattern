package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.beDecorated;

import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Coffee;

public class Decaf extends Coffee {

    public Decaf() {
        setDescription("无因咖啡");
        setPrice(3.60f);
    }
}
