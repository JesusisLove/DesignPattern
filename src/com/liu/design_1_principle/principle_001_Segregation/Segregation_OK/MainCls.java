package com.liu.design_1_principle.principle_001_Segregation.Segregation_OK;

import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.ExcuteOKPattern;

public class MainCls {
    public static void main(String[] arge){
        /* 001 单一职责 */
        excuteOKPattern();
    }
    // 接口隔离原则
    static void excuteOKPattern() {
        ExcuteOKPattern ec = new ExcuteOKPattern();
        ec.doExcute_A();
        ec.doExcute_C();
    }
}
