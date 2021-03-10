package com.liu.design_1_principle.principle_001_Segregation.Segregation_NG;

import com.liu.design_1_principle.principle_001_Segregation.Segregation_NG.Interface1;

// 要求C通过Interface1依赖（使用）D，且C只用到Interface1接口的 1，4，5
public class C {
    public void depends1 (Interface1 i) {
        System.out.println("principle_001_Segregation_NG:C depends on → " + i.operateion1());
    }

    public void depends4 (Interface1 i) {
        i.operateion4();
    }
    public void depends5 (Interface1 i) {
        i.operateion5();
    }
}
