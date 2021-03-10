package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizzastore;

import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order.LondonFactory;
import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order.OrderPizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order.TokyoFactory;

// 出售Pizza的客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        // 使用抽象工厂模式
        new OrderPizza(new LondonFactory());
    }

}
