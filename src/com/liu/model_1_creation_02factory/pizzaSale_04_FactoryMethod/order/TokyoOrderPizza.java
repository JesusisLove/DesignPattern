package com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.order;

import com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.pizza.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TokyoOrderPizza extends OrderPizza {

    Pizza pizza = null;

    // 定义一个抽象方法excuteOrderPizza()，让各个工厂子类自己实现具体方法
    @Override
    public Pizza excuteOrderPizza(String orderlist) {
        Pizza pizza = null;
        System.out.println("orderlist = " + orderlist);
        if ("cheese".equals(orderlist)) {
            pizza = new TokyoCheessPizza();

        } else if ("peper".equals(orderlist)) {
            pizza = new TokyoPepperPizza();
        } else {
            return null;
        }
        createPizza(pizza);
        return pizza;
    }

    private void createPizza (Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
