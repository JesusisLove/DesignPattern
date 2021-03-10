package com.liu.design_1_principle.principle_001_Segregation.Segregation_OK;

import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface1;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface2;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface3;

public class B implements Interface1,Interface2,Interface3 {

    @Override
    public String operateion1() {  return "B.operateion1 is excuted!"; }

    @Override
    public String operateion2() {
        return "B.operateion2 is excuted!";
    }

    @Override
    public String operateion3() {
        return "B.operateion3 is excuted!";
    }

}
