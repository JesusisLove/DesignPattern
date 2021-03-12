package com.liu.design_3_model.creation_03prototype.sheepColone_02ProtoType.cloneSheep;


public class StartMainCls {
    public static void main(String[] args) {
        System.out.println("------- 用原型模式解决克隆羊问题 -------");
        Sheep sheep = new Sheep("Tom", 1, "while");

        // 开始克隆
        Sheep sheep0 = (Sheep) sheep.clone();
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println("------- 用原型模式解决克隆羊问题 :查看克隆羊的成员变量值-------");
        System.out.println("sheep0" + sheep0);
        System.out.println("sheep1" + sheep1);
        System.out.println("sheep2" + sheep2);
        System.out.println("sheep3" + sheep3);
        System.out.println("sheep4" + sheep4);

        System.out.println("------- 用原型模式解决克隆羊问题 :查看克隆羊的HashCode值-------");
        System.out.println("sheep0.hashCode = " + sheep0.hashCode());
        System.out.println("sheep1.hashCode = " + sheep1.hashCode());
        System.out.println("sheep2.hashCode = " + sheep2.hashCode());
        System.out.println("sheep3.hashCode = " + sheep3.hashCode());
        System.out.println("sheep4.hashCode = " + sheep4.hashCode());
    }
}