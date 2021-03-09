package com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.pizza;

public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
