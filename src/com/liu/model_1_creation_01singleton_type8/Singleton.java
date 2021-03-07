package com.liu.model_1_creation_01singleton_type8;

// 单例模式（枚举）
/*
* 定义一个属性
* 向外暴露一个公共方法：sayOK()
* */
enum Singleton {
    INSTANCE; // 属性
    public void sayOK() {
        System.out.println("OK~~");
    }
}
