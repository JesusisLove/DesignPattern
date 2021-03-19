package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder;

public abstract class Drink {
    public String description;
    private float price = 0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 用来计算费用的抽象方法，这个方法会被它的子类来实现
    public abstract float cost();
}
