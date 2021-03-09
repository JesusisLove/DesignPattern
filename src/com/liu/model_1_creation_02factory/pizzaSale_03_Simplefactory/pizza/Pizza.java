package com.liu.model_1_creation_02factory.pizzaSale_03_Simplefactory.pizza;

public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
