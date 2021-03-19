package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.decorator;

import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.Drink;
import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.beDecorated.Espresso;
import com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder.beDecorated.LongBlack;

public class StarBarck {
    public static void main(String[] args) {
        // 消费者订单：来一杯LongBlack咖啡，带2个巧克力再加1份牛奶的订单示意图
        System.out.println("来一杯LongBlack咖啡，带2个巧克力再加1份牛奶");
        // 1. 点一份LongBlack
        Drink drink = new LongBlack();
        System.out.println(drink.getDescription()+"单价："+drink.getPrice());
        // 2. 要牛奶
        drink = new Milk(drink);
        // 3.在要两个巧克力
        drink = new Chocolate(drink);
        drink = new Chocolate(drink);

        System.out.println(drink.getDescription());
        System.out.println("合计：" + drink.cost());


        System.out.println("=======================================");
        System.out.println("Espresso咖啡，带1个巧克力再加1份牛奶");
        // 1. 点一份LongBlack
        Drink drink1 = new Espresso();
        System.out.println(drink1.getDescription()+"单价："+drink1.getPrice());
        // 2. 要牛奶
        drink1 = new Soy(drink1);
        // 3.在要两个巧克力
        drink1 = new Chocolate(drink1);
        System.out.println(drink1.getDescription());
        System.out.println("合计：" + drink1.cost());
    }


}
