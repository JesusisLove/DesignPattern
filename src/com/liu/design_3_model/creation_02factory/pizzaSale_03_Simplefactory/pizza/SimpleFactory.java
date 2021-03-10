package com.liu.design_3_model.creation_02factory.pizzaSale_03_Simplefactory.pizza;


// 简单工厂类
public class SimpleFactory {

    // 根据orderType，返回对应的披萨类对象
    public Pizza createPizza(String orderType) {
        System.out.println("------- 使用简单工厂模式 -------");
        Pizza pizza = null;

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("iteli")){
            pizza = new ItaliPizza();
        } else if (orderType.equals("japan")) {
            pizza = new JapanPizza();
        }
        return pizza;
    }
}
