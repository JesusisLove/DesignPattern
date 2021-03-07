package com.liu.model_1_creation_02factory.simplefactory.pizzaSale_03_Simplefactory.order;

import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_03_Simplefactory.pizza.Pizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_03_Simplefactory.pizza.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getOrderType();
            // 从简单工厂获取相应的披萨种类（也就是说，你要订购什么样的披萨）
            pizza = this.simpleFactory.createPizza(orderType);

            if (pizza != null) {
                // 开始订购
                excuteOrderPizza(pizza);
            } else {
                System.out.println("对不起，目前没有你要的披萨！");
                break;
            }
        } while (true);
    }

    // 获取客户下单订购的披萨种类
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

    // 执行订购
    public void excuteOrderPizza (Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
