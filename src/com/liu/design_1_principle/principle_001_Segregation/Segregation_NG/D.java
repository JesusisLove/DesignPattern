package com.liu.design_1_principle.principle_001_Segregation.Segregation_NG;

import com.liu.design_1_principle.principle_001_Segregation.Segregation_NG.Interface1;

public class D implements Interface1 {
    @Override
    public String operateion1() {
        return "D.operateion1 is excuted!";
    }

    @Override
    public String operateion2() {
        return "D.operateion2 is excuted!";
    }

    @Override
    public String operateion3() {
        return "D.operateion3 is excuted!";
    }

    @Override
    public void operateion4() {
        System.out.println("D.operateion4 is excuted!");
    }

    @Override
    public void operateion5() {
        System.out.println("D.operateion5 is excuted!");
    }
}
