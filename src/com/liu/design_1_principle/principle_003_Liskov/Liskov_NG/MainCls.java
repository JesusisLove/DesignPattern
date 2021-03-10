package com.liu.design_1_principle.principle_003_Liskov.Liskov_NG;

import com.liu.design_1_principle.principle_003_Liskov.Liskov_NG.SubB;
import com.liu.design_1_principle.principle_003_Liskov.Liskov_NG.SupA;

public class MainCls {
    public static void main(String[] arg) {
        SupA a = new SupA();
        System.out.println("11 - 3 = " + a.function1(11,3));
        System.out.println("-----------------------------");
        SubB b = new SubB();
        System.out.println("11 - 3 = " + b.function1(11,3));
        System.out.println("11 - 3 = " + b.function2(11,3));
    }
}
