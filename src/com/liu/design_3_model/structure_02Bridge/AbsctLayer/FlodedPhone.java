package com.liu.design_3_model.structure_02Bridge.AbsctLayer;

import com.liu.design_3_model.structure_02Bridge.AbsPhone;
import com.liu.design_3_model.structure_02Bridge.IBrand;

public class FlodedPhone extends AbsPhone {
    public FlodedPhone(IBrand brand) {
        super(brand);//调用父类的构造器
    }

    public void open() {
        super.open();
        System.out.println("折叠式手机");
    }

    public void shutDown() {
        super.shutDown();
        System.out.println("折叠式手机");
    }

    public void call() {
        super.call();
        System.out.println("折叠式手机");
    }
}