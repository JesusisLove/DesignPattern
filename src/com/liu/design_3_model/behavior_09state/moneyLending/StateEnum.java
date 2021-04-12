package com.liu.design_3_model.behavior_09state.moneyLending;
/*
* 枚举类
* 记录各个借贷状态的信息
* */
public enum StateEnum {

    OVERS_STATE("OVERSTATE"),
    PUBLISH_STATE("PUBLISHED"),
    GENARATE_STATE("GENERATED"),
    NOTPAY_STATE("NOTPAID"),
    PAID_STATE("HASPAID"),
    REVIEW_STATE("REVIEWED");

    StateEnum(String value) {
        this.value = value;
    }

    private final String value;

    public String getValue() {
        return this.value;
    }
}
