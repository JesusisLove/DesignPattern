package com.liu.model_1_creation_02factory.simplefactory.pizzaSale_02_OCP.pizzastore;

import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_02_OCP.order.OrderPizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_02_OCP.pizza.CheesePizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_02_OCP.pizza.GreekPizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_02_OCP.pizza.ItaliPizza;

// 出售Pizza的客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        // 采用单例静态常量模式
        OrderPizza orderPizza = OrderPizza.getInstance();
        // 订购奶酪披萨
        orderPizza.orderPizza(new CheesePizza());
        // 订购希腊披萨
        orderPizza.orderPizza(new GreekPizza());
        // 订购意大利披萨
        orderPizza.orderPizza(new ItaliPizza());
    }
}
