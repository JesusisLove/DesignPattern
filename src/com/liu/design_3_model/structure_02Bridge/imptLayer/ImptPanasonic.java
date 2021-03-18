package com.liu.design_3_model.structure_02Bridge.imptLayer;

import com.liu.design_3_model.structure_02Bridge.IBrand;

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
