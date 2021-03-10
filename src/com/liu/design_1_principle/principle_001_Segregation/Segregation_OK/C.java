package com.liu.design_1_principle.principle_001_Segregation.Segregation_OK;

import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.D;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface1;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface4;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_OK.Interface5;

// 要求C通过Interface1依赖（使用）D，且C只用到Interface1接口的 1，4，5
public class C extends D {
    public void depends1 (Interface1 i) {
        i.operateion1();
    }
    public void depends4 (Interface4 i) {
        i.operateion4();
    }
    public void depends5 (Interface5 i) {
        i.operateion5();
    }
}
