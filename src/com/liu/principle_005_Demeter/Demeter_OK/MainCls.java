package com.liu.principle_005_Demeter.Demeter_OK;

public class MainCls {
    public static void main(String[] arg) {
        System.out.println("～～～～采用类迪米特法则的代码演示～～～～");
        new SchoolManager().pringAllEmployee(new CollegeManager());
    }
}