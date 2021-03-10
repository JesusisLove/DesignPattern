package com.liu.design_3_model.creation_02factory.pizzaSale_04_FactoryMethod.pizzastore;

import com.liu.design_3_model.creation_02factory.pizzaSale_04_FactoryMethod.order.OrderPizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_04_FactoryMethod.order.LDOrderPizza;

// 出售Pizza的客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        // 使用工厂方法模式
    OrderPizza orderPizza =  new LDOrderPizza();

    }

}
