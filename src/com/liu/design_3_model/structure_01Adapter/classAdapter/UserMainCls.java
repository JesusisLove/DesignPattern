package com.liu.design_3_model.structure_01Adapter.classAdapter;

public class UserMainCls {
    public static void main(String[] args) {
        System.out.println("------- 采用类适配器模式实际手机充电功能 案例 -------");
        // 用户买的手机
        Phone iPhone = new Phone();

        // 手机随身带的充电器
        AdapterOutPutVoltage5V adapter = new PhoneAdapter();

        // 用户将手机接入充电器
        iPhone.setAdapter(adapter);

        // 开始执行手机充电
        iPhone.charing();

    }
}
