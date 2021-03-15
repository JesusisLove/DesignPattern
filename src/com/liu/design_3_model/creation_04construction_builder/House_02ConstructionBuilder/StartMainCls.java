package com.liu.design_3_model.creation_04construction_builder.House_02ConstructionBuilder;

public class StartMainCls {
    public static void main(String[] args) {
        // 想盖一间普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 联系到了一个盖房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);// 采用构造器传递参数
        // 完成盖房子后，返回产品（普通房子）
        House house = houseDirector.constructHouse();
        System.out.println("【house.hashCode=" + house.hashCode() + "】house.basic = "+house.getBasic());

        System.out.println("----------------------------------------------------");
        // 想盖一座摩天大楼
        HightBuliding hightBuliding = new HightBuliding();
        // 重置建造者（还是用现有的指挥者）
        houseDirector.setHouseBulider(hightBuliding);// 采用setter方法传递参数
        // 完成盖完摩天大楼之后，返回产品（摩天大楼）
        house = houseDirector.constructHouse();
        System.out.println("【house.hashCode=" + house.hashCode() + "】house.basic = "+house.getBasic());


        System.out.println("----------------------------------------------------");
        BigVillaHouse villaHouse = new BigVillaHouse();
        houseDirector.setHouseBulider(villaHouse);
        house = houseDirector.constructHouse();
        System.out.println("【house.hashCode=" + house.hashCode() + "】house.basic = "+house.getBasic());

//        buliderSampleInJDK();
    }

    /*
    * 建造者模式再JDK的应用和源码分析
    * */
    static void buliderSampleInJDK() {
        StringBuilder stringBuilder = new StringBuilder("hello,world");
        System.out.println(stringBuilder);
    }
}
