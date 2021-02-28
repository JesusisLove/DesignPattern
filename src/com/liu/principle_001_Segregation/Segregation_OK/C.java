package com.liu.principle_001_Segregation.Segregation_OK;

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
