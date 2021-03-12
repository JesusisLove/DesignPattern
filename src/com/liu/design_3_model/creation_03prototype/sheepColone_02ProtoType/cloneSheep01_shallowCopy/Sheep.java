package com.liu.design_3_model.creation_03prototype.sheepColone_02ProtoType.cloneSheep01_shallowCopy;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    //  添加一个类的成员变量，看看克隆是，类的成员变量的哈希值会不会改变 start
    private Sheep friend;
    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }
    //  添加一个类的成员变量，看看克隆是，类的成员变量的哈希值会不会改变 end

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    // 克隆该实例，使用默认的clone()方法来完成
    @Override
    protected Object clone()  { // 先不用throws CloneNotSupportedException异常，使用try-cathc块
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
