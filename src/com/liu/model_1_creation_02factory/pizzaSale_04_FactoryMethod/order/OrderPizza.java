package com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.order;

import com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public OrderPizza() {
        String orderType = "";
        System.out.println("a");
        do {
            orderType = getOrderType();
            // 从简单工厂获取相应的披萨种类（也就是说，你要订购什么样的披萨）
            excuteOrderPizza(orderType);
        } while (true);
    }

    // 定义一个抽象方法orderPizza()，让各个工厂子类自己实现具体方法，这就是工厂方法模式
    public abstract Pizza excuteOrderPizza(String orderlist);

    // 获取客户下单订购的披萨种类L
    private String getOrderType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(("输入的披萨种类是："));
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
