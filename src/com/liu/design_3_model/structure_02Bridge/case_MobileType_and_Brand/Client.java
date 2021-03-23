package com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand;

import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.AbsctLayer.FlodedPhone;
import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.AbsctLayer.UpRightPhone;
import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.imptLayer.ImptIPhone;
import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.imptLayer.ImptPanasonic;
import com.liu.design_3_model.structure_02Bridge.case_MobileType_and_Brand.imptLayer.ImptSony;

public class Client {
    public static void main(String[] args) {
        System.out.println("=========桥接模式========");
        // 选一个品牌吧：苹果手机
        IBrand iphone = new ImptIPhone();
        // 选一种款式吧：折叠式手机
        AbsPhone phone = new FlodedPhone(iphone);
        // 操作一下你刚才选的这款手机吧
        let_me_try(phone);
        System.out.println("===============================");

        // 选一个品牌吧：索尼手机
        IBrand sony = new ImptSony();
        // 选一种款式吧：直立式手机
        phone = new UpRightPhone(sony);
        // 操作一下你刚才选的这款手机吧
        let_me_try(phone);
        System.out.println("===============================");

        // 选一个品牌吧：松下手机
        iphone = new ImptPanasonic();
        // 选一种款式吧：折叠式手机
        phone = new FlodedPhone(iphone);
        // 操作一下你刚才选的这款手机吧
        let_me_try(phone);


    }

    static void let_me_try(AbsPhone phone) {
        phone.open();
        phone.call();
        phone.shutDown();
    }
}
