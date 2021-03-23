package com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.AbsctLayer;

import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.AbsPhone;
import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.IBrand;

public class UpRightPhone extends AbsPhone {
    public UpRightPhone(IBrand brand) {
        super(brand);//调用父类的构造器
        System.out.println("【直立式手机】");
    }

    public void open() {
        super.open();
    }

    public void shutDown() {
        super.shutDown();
    }

    public void call() {
        super.call();
    }
}
