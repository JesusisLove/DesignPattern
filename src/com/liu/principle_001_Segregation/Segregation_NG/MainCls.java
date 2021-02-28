package com.liu.principle_001_Segregation.Segregation_NG;

public class MainCls {
    public static void main(String[] arge){
        /* 001 单一职责 */
        excuteNGPattern();
    }
    // 接口未隔离
    static void excuteNGPattern() {
        ExcuteNGPattern ec = new ExcuteNGPattern();
        ec.doExcute_A();
        ec.doExcute_C();
    }
}
