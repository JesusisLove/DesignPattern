package com.liu.design_1_principle.principle_003_Liskov.Liskov_OK;

import com.liu.design_1_principle.principle_003_Liskov.Liskov_OK.SubA;
import com.liu.design_1_principle.principle_003_Liskov.Liskov_OK.SubB;

public class MainCls {
    public static void main(String[] arg) {
        SubA a = new SubA();
        System.out.println("11 - 3 = " + a.function1(11,3));

        System.out.println("-----------------------------");
        SubB b = new SubB();
        System.out.println("11 + 3 = " + b.function1(11,3));
        System.out.println("11 + 3 + 10 = " + b.function2(11,3));
        System.out.println("11 - 3 = " + b.func3(11,3));

    }
}
