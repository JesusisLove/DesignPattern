package com.liu.design_3_model.creation_02factory.pizzaSale_02_OCP.order;

import com.liu.design_3_model.creation_02factory.pizzaSale_02_OCP.pizza.Pizza;

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
