package com.liu.design_3_model.creation_02factory.pizzaSale_05_AbstractFactory.pizza;

/* 2021/03/12日，随着业务的扩大，适应更多消费者口味，东京披萨店决定新增加了一个咖喱口味的Pizza
*  就在系统里扩展类一个TokyoCarrayPizza口味的类
* */
public class TokyoCarryPizza extends Pizza {

    public TokyoCarryPizza() {
        name = "东京风味的咖喱披萨";
    }

    public String getName() {
        return name;
    }

    @Override
    public void prepare() {
        System.out.println("正在按照" + name + "的做法，准备原材料...");
    }

    @Override
    public void bake() {
        System.out.println(name + "正在烘烤中...");
    }

    @Override
    public void cut() {
        System.out.println(name + "正在切割中...");
    }

    @Override
    public void box() {
        System.out.println(name + "正在包装中......");
    }

}
