package com.liu.design_2_uml.uml_006_Composition;

/*
* 组合关系表示的是整体和部分的关系，但是，整体不能与部分分开。
* 一旦Person这个对象销毁类，局部的肢体类对象也会跟着销毁。
* 组合关系是关联关系的特例，所以它具有关联的导航性与多重性。
* */

public class Person {
    private Hands hands = new Hands(); // 手离不开人这个整体而单独存在
    private Eye eye   = new Eye();   // 眼离不开人这个整体而单独存在
    private Ear ear   = new Ear();   // 耳离不开人这个整体而单独存在
    private Feet feet  = new Feet();  // 脚离不开人这个整体而单独存在

    // 人体器官类不能离开人而单独存在，所以人与器官类的关系是组合关系，所以在new Person()的同时，必须new器官的类对象
    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public void setEye(Eye eye) {
        this.eye = eye;
    }

    public void setEar(Ear ear) {
        this.ear = ear;
    }

    public void setFeet(Feet feet) {
        this.feet = feet;
    }

    // 身份证和人是聚合关系，身份证可以离开人而单独存在，所以在new Person()的同时，不必同时new一个IDCard对象
    private IDCard idCard;

    // 证件类可以离开人而单独存在（身份证丢了可以再去补办一个），所以人与证件类的关系是聚合关系
    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
    // 另外，有的场合可以，人和身份证的关系也可以是组合关系，在项目开发中，如果实体中定义类对IDCard有级联删除要求的时候，
    // 也就是说，删除了Person时连同IDCard一起删除，那么IDCard和Person的关系就是组合关系了。

}
