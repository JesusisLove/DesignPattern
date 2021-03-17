package com.liu.design_3_model.structure_01Adapter.case2_objectAdapter;

public class UserMainCls {
    public static void main(String[] args) {
        System.out.println("------- 采用对象适配器模式实际手机充电功能 案例 -------");
        // 用户买的手机
        Phone iPhone = new Phone();

        // 找到电源
        AdapterInputVoltage220V inputVoltage220 = new AdapterInputVoltage220V();

        // 手机随身带的充电器接入220V电源
        AdapterOutPutIVoltage5V adapter = new PhoneAdapter(inputVoltage220);

        // 用户将手机接入充电器
        iPhone.setAdapter(adapter);

        // 开始执行手机充电
        iPhone.charing();

    }
}
