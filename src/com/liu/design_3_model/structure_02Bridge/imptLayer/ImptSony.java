package com.liu.design_3_model.structure_02Bridge.imptLayer;

import com.liu.design_3_model.structure_02Bridge.IBrand;

public class ImptSony implements IBrand {
    @Override
    public void open() {
        System.out.println("索尼手机开机。。。");
    }

    @Override
    public void shutdown() {
        System.out.println("索尼手机关机。。。");
    }

    @Override
    public void call() {
        System.out.println("索尼手机打电话。。。");
    }
}
