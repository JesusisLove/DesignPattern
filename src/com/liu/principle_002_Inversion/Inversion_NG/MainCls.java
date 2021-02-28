package com.liu.principle_002_Inversion.Inversion_NG;

public class MainCls {
    public static void main(String[] arge){
        executeInversion_NG();
    }

    /* 002 依赖倒转 */
    // 没有使用接口依赖的缺陷在于：每增加一个通讯接收器，都要对Person类进行追加相应的方法，如果有1000种通讯类，要追加1000个方法-----方法追加冗长
    static void executeInversion_NG() {
        Person_NG_Pattern p = new Person_NG_Pattern();
        p.receive(new Community_Email());
        p.receive(new Community_LINE());
    }
}
