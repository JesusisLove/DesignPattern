package com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.order;

import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.pizza.CheesePizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.pizza.GreekPizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
