package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
