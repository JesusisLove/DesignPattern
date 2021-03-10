package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order;

import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizza.*;

public class TokyoFactory implements AbsFactory {

    // 实现父类的抽象方法excuteOrderPizza()，让各个工厂子类自己实现具体方法
    @Override
    public Pizza excuteOrderPizza(String orderlist) {
        System.out.println("b");
        Pizza pizza = null;
        if ("cheese".equals(orderlist)) {
            pizza = new TokyoCheessPizza();
        } else if ("peper".equals(orderlist)) {
            pizza = new TokyoPepperPizza();
        }
        return pizza;
    }
}
