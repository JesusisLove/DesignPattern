package com.liu.design_3_model.structure_07Proxy.type2_DynamicProxy;

public interface ITeacherDao {
    // 老师上课
    void teach();
    // 老师上课之前，要学生签到，比如班级出勤率达到80%就可以上课，否则不上课
    float studentCheckIn (String stuName);
}