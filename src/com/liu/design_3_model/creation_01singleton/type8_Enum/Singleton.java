package com.liu.design_3_model.creation_01singleton.type8_Enum;

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
