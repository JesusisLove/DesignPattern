package com.liu.principle_004_OpenClose.OpenClose_OK;
/* 对004_NG的方案进行改进
* 首先把Shape这个父类改成抽象基类
* 添加draw（）抽象方法
* */
public abstract class Provider_Shape {
    public abstract void draw();
}
