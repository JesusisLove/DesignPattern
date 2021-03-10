package com.liu.design_1_principle.principle_005_Demeter.Demeter_NG;

import com.liu.design_1_principle.principle_005_Demeter.Demeter_NG.CollegeEmployee;

import java.util.ArrayList;
import java.util.List;

// 这是管理学院员工的管理类
public class CollegeManager {
    // 返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id" + i);
            list.add(employee);
        }
        return list;
    }
}
