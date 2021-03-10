package com.liu.design_1_principle.principle_001_Segregation.Segregation_OK;

import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface1;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface2;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface3;

public class A {
    public void depends1 (Interface1 i) {
        System.out.println("A depends on:" + i.operateion1());
    }
    public void depends2 (Interface2 i) {
        i.operateion2();
    }
    public void depends3 (Interface3 i) {
        i.operateion3();
    }
}
