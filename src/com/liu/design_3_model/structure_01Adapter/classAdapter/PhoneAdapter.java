package com.liu.design_3_model.structure_01Adapter.classAdapter;

public class PhoneAdapter extends AdapterInputVoltage220V implements AdapterOutPutVoltage5V {
    private int srcV = 0;

    // 手机充电器开关
    public PhoneAdapter() {
        srcV = super.provide220V();
        System.out.println("充电器已经插入电源插座接通了" + srcV +"伏特的电压了");
    }

    @Override
    public int output5V() {
        int dstV = srcV/44;
        System.out.println("手机充电器output电压是："+ dstV +"伏特");
        return dstV;
    }
}
