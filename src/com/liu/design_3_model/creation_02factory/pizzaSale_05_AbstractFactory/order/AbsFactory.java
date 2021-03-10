package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.order;

import com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizza.Pizza;

// 这是Pizza系统定义的抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    // 定义一个订购披萨的抽象方法excuteOrderPizza()，各种口味的披萨在各个口味披萨的工厂子类自己实现具体方法
    public abstract Pizza excuteOrderPizza(String orderpizza);
}
