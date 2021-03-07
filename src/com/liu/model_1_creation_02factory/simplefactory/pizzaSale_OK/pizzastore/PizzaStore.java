package com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.pizzastore;

import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.order.OrderPizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.pizza.CheesePizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.pizza.GreekPizza;
import com.liu.model_1_creation_02factory.simplefactory.pizzaSale_OK.pizza.ItaliPizza;

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
