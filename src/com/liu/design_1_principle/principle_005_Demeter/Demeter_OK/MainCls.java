package com.liu.design_1_principle.principle_005_Demeter.Demeter_OK;

import com.liu.design_1_principle.principle_005_Demeter.Demeter_OK.CollegeManager;
import com.liu.design_1_principle.principle_005_Demeter.Demeter_OK.SchoolManager;

public class MainCls {
    public static void main(String[] arg) {
        System.out.println("～～～～采用了迪米特法则的代码演示～～～～");
        new SchoolManager().pringAllEmployee(new CollegeManager());
    }
}