package com.liu.design_3_model.creation_02factory.pizzaSale_04_FactoryMethod.order;

import com.liu.design_3_model.creation_02factory.pizzaSale_04_FactoryMethod.pizza.LDCheessPizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_04_FactoryMethod.pizza.LDPepperPizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_04_FactoryMethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    public LDOrderPizza() {
        System.out.println("c");
    }

    // 实现父类的抽象方法excuteOrderPizza()，让各个工厂子类自己实现具体方法
    @Override
    public Pizza excuteOrderPizza(String orderlist) {
        System.out.println("b");
        Pizza pizza = null;
        if ("cheese".equals(orderlist)) {
            pizza = new LDCheessPizza();

        } else if ("peper".equals(orderlist)) {
            pizza = new LDPepperPizza();

        } else {
            return null;
        }
        createPizza(pizza);
        return pizza;
    }

    private void createPizza (Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
