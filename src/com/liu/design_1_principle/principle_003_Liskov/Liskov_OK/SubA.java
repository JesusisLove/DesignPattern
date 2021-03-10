package com.liu.design_1_principle.principle_003_Liskov.Liskov_OK;

import com.liu.design_1_principle.principle_003_Liskov.Liskov_OK.Base;

public class SubA extends Base {
    public int function1(int num1,int num2) {
        return num1 - num2;
    }
}
