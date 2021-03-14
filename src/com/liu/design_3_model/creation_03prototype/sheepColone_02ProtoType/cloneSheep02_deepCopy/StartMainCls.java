package com.liu.design_3_model.creation_03prototype.sheepColone_02ProtoType.cloneSheep02_deepCopy;

public class StartMainCls {
    public static void main(String[] args) throws Exception {
        System.out.println("------- 用原型模式解决克隆羊问题(深拷贝) -------");
        // 运行使用clone方法的深拷贝（实现深拷贝：方法一 ）
//        doClone();

        // 运行使用采用序列化方法的深拷贝（实现深拷贝：方法二 ）
        doSerializable();

    }

    static void doClone()throws Exception {
        Sheep sheep = new Sheep();
        // 开始克隆深拷贝
        Sheep sheep0 = (Sheep) sheep.clone();
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        // 执行代码测试一下克隆出来的sheep0，sheep1...的类成员器官对象是不是同一个对象
        System.out.println("sheep0.hashCode = " + sheep0.hashCode() + "  //sheep0.heart = " + sheep0.getHeart().hashCode() + "  //sheep0.liver = " + sheep0.getLiver().hashCode());
        System.out.println("sheep1.hashCode = " + sheep1.hashCode() + "  //sheep1.heart = " + sheep1.getHeart().hashCode() + "  //sheep1.liver = " + sheep1.getLiver().hashCode());
        System.out.println("sheep2.hashCode = " + sheep2.hashCode() + "  //sheep2.heart = " + sheep2.getHeart().hashCode());
        System.out.println("sheep3.hashCode = " + sheep3.hashCode() + "  //sheep3.heart = " + sheep3.getHeart().hashCode());
        System.out.println("sheep4.hashCode = " + sheep4.hashCode() + "  //sheep4.heart = " + sheep4.getHeart().hashCode());

        /* 根据执行结果：sheep0，sheep1...这些克隆羊对象的心脏器官就都是各自的心脏器官类：这样的拷贝就是深拷贝：
         */
    }

    static void doSerializable() {
        Sheep sheep = new Sheep();
        // 开始序列化深拷贝
        Sheep sheep0 = (Sheep) sheep.deepCloneWithSerializable();
        Sheep sheep1 = (Sheep) sheep.deepCloneWithSerializable();

        System.out.println("sheep0.hashCode = " + sheep0.hashCode() +
                "  //sheep0.heart = " + sheep0.getHeart().hashCode() +
                "  //sheep0.liver = " + sheep0.getLiver().hashCode());

        System.out.println("sheep1.hashCode = " + sheep1.hashCode() +
                "  //sheep1.heart = " + sheep1.getHeart().hashCode() +
                "  //sheep1.liver = " + sheep1.getLiver().hashCode());


    }

}