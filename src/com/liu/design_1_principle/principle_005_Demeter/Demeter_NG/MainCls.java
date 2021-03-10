package com.liu.design_1_principle.principle_005_Demeter.Demeter_NG;

import com.liu.design_1_principle.principle_005_Demeter.Demeter_NG.CollegeManager;
import com.liu.design_1_principle.principle_005_Demeter.Demeter_NG.SchoolManager;

public class MainCls {
    public static void main(String[] arg) {
        System.out.println("～～～～未采用类迪米特法则的代码演示～～～～");
        new SchoolManager().pringAllEmployee(new CollegeManager());
    }
}