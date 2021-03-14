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
        /* 上面代码是用传统的方式实现克隆，是可以的，
        * new Sheep(sheep.getName(),sheep.getAge(), sheep.getColor())这里面是三个参数，如果Sheep类里有很多个
        * 成员变量（如200个成员变量）时，这种写法就显得很笨拙了，怎么办？
        * 让Sheep继承Cloneable类，直接调用Object clone()方法拷贝对象
        * 解决方法参看--->cloneSheep01_shallowCopy和cloneSheep02_deepCopy
        *  */

        System.out.println("sheep0" + sheep0);
        System.out.println("sheep1" + sheep0);
        System.out.println("sheep2" + sheep0);
        System.out.println("sheep3" + sheep0);
        System.out.println("sheep4" + sheep0);
    }
}
