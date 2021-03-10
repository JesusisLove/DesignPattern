package com.liu.design_1_principle.principle_001_Segregation.Segregation_OK;

import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface1;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface4;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface5;

public class D implements Interface1,Interface4,Interface5 {
    @Override
    public String operateion1() {
        return "D.operateion1 is excuted!";
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
