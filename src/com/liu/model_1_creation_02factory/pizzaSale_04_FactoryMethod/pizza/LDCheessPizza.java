package com.liu.model_1_creation_02factory.pizzaSale_04_FactoryMethod.pizza;

public class LDCheessPizza extends Pizza {

    private String name = null;
    public String getName() {
        return name;
    }
    public LDCheessPizza() {
        name = "伦敦风味奶酪披萨";
    }
    @Override
    public void prepare() {
        System.out.println("正在按照" + name + "的做法，准备原材料...");;
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
