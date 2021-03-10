package com.liu.design_3_model.creation_02factory.pizzaSale_01_NG.order;

import com.liu.design_3_model.creation_02factory.pizzaSale_01_NG.pizza.CheesePizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_01_NG.pizza.GreekPizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_01_NG.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    // 构造器
    public OrderPizza () {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getOrderType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪");
            } else {
                break;
            }
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    // 获取客户可以订购的披萨种类
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
