package com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.pizzastore;

import com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.order.LDOrderPizza;
import com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.order.OrderPizza;
import com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.order.TokyoOrderPizza;

// 出售Pizza的客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        // 使用工厂方法模式
    OrderPizza orderPizza =  new LDOrderPizza();

    }

}
