package com.liu.design_3_model.structure_07Proxy.type1_staticProxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中。。。。");
    }
}
