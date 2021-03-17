package com.liu.design_3_model.structure_01Adapter.objectAdapter;

public class PhoneAdapter implements AdapterOutPutVoltage5V {

    /* 对象适配器就是，利用【合成复用原则】，破除继承关系，该用关联关系，降低类直接的耦合度
    * 让PhoneAdapter类持有AdapterInputVoltage220V类对象，
    * 而不是继承AdapterInputVoltage220V
    * 本案例采用的是聚合关系
    * */
    private AdapterInputVoltage220V src220V;
    private int srcV = 0;

    public PhoneAdapter (AdapterInputVoltage220V src220V) {
        this.src220V = src220V;
        turn_on_adapter();
    }

    // 手机充电器开关
    private void turn_on_adapter() {
        srcV = src220V.provide220V();
        System.out.println("充电器已经插入电源插座接通了" + srcV +"伏特的电压了");
    }

    @Override
    public int output5V() {
        int dstV = srcV/44;
        System.out.println("手机充电器output电压是："+ dstV +"伏特");
        return dstV;
    }
}
