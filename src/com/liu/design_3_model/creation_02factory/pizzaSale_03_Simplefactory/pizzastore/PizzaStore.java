package com.liu.design_3_model.creation_02factory.pizzaSale_03_Simplefactory.pizzastore;

import com.liu.design_3_model.creation_02factory.pizzaSale_03_Simplefactory.order.OrderPizza;
import com.liu.design_3_model.creation_02factory.pizzaSale_03_Simplefactory.pizza.SimpleFactory;

// 出售Pizza的客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
    }
    /*java
    * 实际上，简单工厂遵循类OCP原则，即对提供者（继承Pizza的子类）开放扩展，对使用者（OrderPizza）关闭修改
    * 那么，SimpleFactory在这里是做什么用的呢？首先，在没有SimpleFactory类的情况下
    * OrderPizza类和Pizza及其子类发生依赖关系，是1:n的依赖关系
    * 引入SimpleFactory类（对象工厂）的目的是，SimpleFactory类里收纳所有的Pizza类，让OrderPezza类和SimpleFactory类直接
    * 发生依赖关系且是1:1的关系，OrderPizza的时，需要什么样的披萨，由SmipleFactory来决定。
    * 这样的思想让程序业务维护起来方便，清晰
    * */
}
