package com.liu.model_1_creation_02factory.simplefactory.pizzaSale_02_OCP.order;

import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_02_OCP.pizza.Pizza;

public class OrderPizza {
    private static final OrderPizza instance = new OrderPizza();
    // 构造器
    private OrderPizza () {
    }

    public static final OrderPizza getInstance() {
            return instance;
    }

    public void orderPizza (Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
