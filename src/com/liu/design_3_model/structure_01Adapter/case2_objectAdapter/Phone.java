package com.liu.design_3_model.structure_01Adapter.case2_objectAdapter;

public class Phone {

    AdapterOutPutIVoltage5V adapter = null;
    // 将手机接入充电器
    public void setAdapter(AdapterOutPutIVoltage5V adapter) {
        System.out.println("手机已经连上了充电器。。。");
        this.adapter = adapter;
    }

    /* 当手机用户执行手机的充电操作时，执行该方法 */
    public void charing() {
        // 手机开始连接使用充电器
        int dstV = adapter.output5V();
        // 如果有输出电压，则显示正在充电中。。。。
        if (dstV == 5) {
            System.out.println("手机正在充电中🔋。。。。。。");
        }
    }
}
