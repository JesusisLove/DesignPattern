package com.liu.design_3_model.structure_07Proxy.type2_DynamicProxy;

public class TeacherDao implements ITeacherDao {
    // 老师开始上课
    @Override
    public void teach() {
        System.out.println("老师授课中。。。。");
    }

    // 老师要确认该班级学生的出勤率
    @Override
    public float studentCheckIn(String stuName) {
        return 1.0f;
    }
}
