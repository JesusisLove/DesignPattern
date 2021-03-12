package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizzastore;

import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order.OrderPizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order.TokyoPizzaBusinessFactory;

import java.util.Calendar;

// 出售Pizza的客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        // 使用抽象工厂模式
        TokyoPizzaBusinessFactory tokyoPizza = new TokyoPizzaBusinessFactory();
        OrderPizza i_want_a_pizza = new OrderPizza(tokyoPizza);

        /* ⭐️⭐️⭐️⭐️　JDK中的Calendar类中，就使用了简单工厂模式　⭐️⭐️⭐️*/
        // getInstance()是Calendar的一个静态方法
        Calendar calendar = Calendar.getInstance();
    }

}
