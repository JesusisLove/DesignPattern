package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order;

import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizza.*;

public class TokyoPizzaBusinessFactory implements AbsFactory {

    // 实现父类的抽象方法excuteOrderPizza()，让各个工厂子类自己实现具体方法
    @Override
    public Pizza excuteOrderPizza(String orderlist) {
        System.out.println("b");
        Pizza pizza = null;
        if ("cheese".equals(orderlist)) {
            pizza = new TokyoCheessPizza();
        } else if ("peper".equals(orderlist)) {
            pizza = new TokyoPepperPizza();
        }/* 2021/03/12日，随着业务的扩大，适应更多消费者口味，东京披萨店决定新增加了一个咖喱口味的Pizza */
        else if ("carry".equals(orderlist)) {
            pizza = new TokyoCarryPizza();
        }
        return pizza;
    }
}
