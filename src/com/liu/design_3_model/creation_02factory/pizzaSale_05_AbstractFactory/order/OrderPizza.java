package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order;

import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    Pizza pizza = null;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        this.factory = factory;
        String orderType = "";
        System.out.println("a");
        do {
            orderType = getOrderType();
            // factory可能是TokyoFactory的工厂子类，也可能是LondonFactory的工厂子类
            pizza = factory.excuteOrderPizza(orderType);
            if (pizza != null) {
                // 根据客户的口味要求，开始做披萨
                createPizza(pizza);
                // 披萨做好后，递给顾客
                System.out.println("您好！您订购的【"+pizza.getName()+"】做好了，请拿好，谢谢光临！ ^_^");
            } else {
                System.out.println("对不起，没有你要的披萨！");
                break;
            }
        } while (true);
    }

    // Java的多态性，调用各自Pizza子类的方法
    private void createPizza (Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    // 获取客户下单订购的披萨种类L
    private String getOrderType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(("你好，欢迎光临👏👏👏，我们这里有cheese口味，peper口味，carry口味的披萨，请问您要什么口味的披萨种呀？："));
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
