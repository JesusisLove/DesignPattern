package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizza;

public abstract class Pizza {
    protected String name;
    public abstract String getName();
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
