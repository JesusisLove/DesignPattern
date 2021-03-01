package com.liu.principle_005_Demeter.Demeter_OK;

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
        return list;// 分析：由list里盛放的返回值是CollegeEmployee类的对象，可以知道CollegeEmployee类与CollegeManager是直接的朋友关系
    }

    //  ⭐⭐⭐⭐-------迪米特法则 改进开始 -------⭐⭐⭐⭐ //
//  下面的代码块来自 ---->  SchoolManager.java 的pringAllEmployee(CollegeManager sub)
//        List<CollegeEmployee> list1 = sub.getAllEmployee();
//        System.out.println(("-------学院的员工-------"));
//        for (CollegeEmployee employee:list1) {// CollegeEmployee是SchoolManager的陌生类，并且是以局部变量的方式出现再了当前类中，违反了迪米特法则
//            System.out.println(employee.getId());
//        }
    public void printCollegeEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        for (CollegeEmployee employee:list1) {
            System.out.println(employee.getId());
        }
    }
    //  ⭐⭐⭐⭐-------迪米特法则 改进结束 -------⭐⭐⭐⭐ //

//    总结：
//    ①明确类直接存在的朋友关系（B类是成A类的员变量，方法参数，方法返回值，则A和B是直接朋友）
//    ②A的陌生类C，不要耦合，而是采用最少知道原则（把陌生类封装在B类里，前提是B和C是直接朋友）
}
