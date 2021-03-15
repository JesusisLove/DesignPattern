package com.liu.design_3_model.creation_04construction_builder.House_01Tranditional;

public class StartMainCls {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.doBuild();

    }

    /*传统方式解决盖房需求方案设计问题分析
    *   1）优点是比较好理解，简单易操作
    *   2）设计的程序结构，过于简单，没有设计缓冲层对象，程序的可扩展性和可维护性不好。也就是说，这种设计方案，把产品（即：房子）和创建产品的过程（即：房子的建造流程）封装在一起，增强了类的耦合性。
    *   3）解决方案：将产品和产品建造过程解耦 ==>建造者模式
    * */
}