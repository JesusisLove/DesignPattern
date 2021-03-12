package com.liu.design_3_model.creation_03prototype.sheepColone_01traditionalColoneSolution;

public class MainCls {
    public static void main(String[] args) {
        System.out.println("------- 用传统思路解决克隆羊问题 -------");
        Sheep sheep = new Sheep("Tom",1,"while");
        // 开始克隆
        Sheep sheep0 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep8 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());
        Sheep sheep9 = new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor());

        System.out.println("sheep0" + sheep0);
        System.out.println("sheep1" + sheep0);
        System.out.println("sheep2" + sheep0);
        System.out.println("sheep3" + sheep0);
        System.out.println("sheep4" + sheep0);
    }
}
