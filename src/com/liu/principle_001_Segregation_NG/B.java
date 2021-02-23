package com.liu.principle_001_Segregation_NG;

public class B implements Interface1 {
    @Override
    public String operateion1() {
        return "B.operateion1 is excuted!";
    }

    @Override
    public String operateion2() {
        return "B.operateion2 is excuted!";
    }

    @Override
    public String operateion3() {
        return "B.operateion3 is excuted!";
    }

    @Override
    public void operateion4() {
        System.out.println("B.operateion4 is excuted!");
    }

    @Override
    public void operateion5() {
        System.out.println("B.operateion5 is excuted!");
    }
}
