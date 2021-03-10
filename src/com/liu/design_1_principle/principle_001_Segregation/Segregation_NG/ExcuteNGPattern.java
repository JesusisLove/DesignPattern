package com.liu.design_1_principle.principle_001_Segregation.Segregation_NG;


import com.liu.design_1_principle.principle_001_Segregation.Segregation_NG.A;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_NG.B;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_NG.C;
import com.liu.design_1_principle.principle_001_Segregation.Segregation_NG.D;

public class ExcuteNGPattern {
    public void doExcute_A() {
        // A对象依赖（使用）B，B实现了Interface1接口
        A a = new A();
        B b = new B();
        a.depends1(b);
        a.depends2(b);
        a.depends3(b);
    }
    public void doExcute_C() {
        // C对象依赖（使用）D，D实现了Interface1接口
        C c = new C();
        D d = new D();
        c.depends1(d);
        c.depends4(d);
        c.depends5(d);
    }
}
