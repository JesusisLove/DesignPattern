package com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.imptLayer;

import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.IBrand;

public class ImptPanasonic implements IBrand {
    @Override
    public void open() {
        System.out.println("松下手机开机。。。");
    }

    @Override
    public void shutdown() {
        System.out.println("松下手机关机。。。");
    }

    @Override
    public void call() {
        System.out.println("松下手机打电话。。。");
    }
}
