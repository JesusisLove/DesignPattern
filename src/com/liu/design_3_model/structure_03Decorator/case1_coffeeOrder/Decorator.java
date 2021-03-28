package com.liu.design_3_model.structure_03Decorator.case1_coffeeOrder;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {// 体现出Drink被聚合进来了
        this.obj = obj;
    }

    @Override
    public float cost() {
        /* 调味品这块儿的价格处理需要注意
        * super.getPrice()这是调味品自身的价格
        * 还要再加上打包📦的被装饰者的价钱
        * */
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescription() {
        // 调味品本身的描述：如chocolate，milk等
        String description = super.getDescription();
        // 调味品本身的价格
        float price = super.getPrice();
        // 被打包的单品咖啡的描述
        String objDescription = obj.getDescription();

        return description + " " + price + " " + objDescription;
    }
}