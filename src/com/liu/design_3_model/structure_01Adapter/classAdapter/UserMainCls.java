package com.liu.design_3_model.structure_01Adapter.classAdapter;

public class UserMainCls {
    public static void main(String[] args) {
        // 用户买的手机
        Phone iPhone = new Phone();

        // 手机随身带的充电器
        PhoneAdapter adapter = new PhoneAdapter();

        // 用户将充电器插头插入220V电压插座
        adapter.turn_on_adapter();

        // 用户将手机接入充电器
        iPhone.setAdapter(adapter);

        // 开始执行手机充电
        iPhone.charing();

    }
}
