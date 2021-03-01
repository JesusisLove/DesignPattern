package com.liu.principle_005_Demeter.Demeter_OK;

import java.util.ArrayList;
import java.util.List;

// 这是学校的管理类
public class SchoolManager {
    // 返回学校总部的所有员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校的员工id" + i);
            list.add(employee);
        }
        return list;
    }
    /*分析SchoolManager类的直接朋友都有哪些？
    * 🔹Employee是SchoolManager的直接朋友，因为getAllEmployee()方法的返回之类型是Employee。
    * Aさん：等等！咦？返回的不是List吗？
    * B先生：嘿嘿，list里面放的是什么呀？
    * Aさん：Employee的类对象呀！---哦～，这样啊，哈哈，懂了！😊
    *
    * */
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/

    // 打印学院的员工和学校总部的员工
    void pringAllEmployee(CollegeManager sub) {
    //  ⭐⭐⭐⭐-------迪米特法则 改进开始 -------⭐⭐⭐⭐ //
// 改进：根据迪米特法则，这个代码块应该放封装在 CollegeManager里---->CollegeManager.java，因为CollegeEmployee是SchoolManager的陌生类
//      不要让陌生类与SchoolManager有耦合关系，SchoolManager对CollegeEmployee应该采用最少知道原则。所以这个代码块应该放封装在CollegeManager类里
//        List<CollegeEmployee> list1 = sub.getAllEmployee();
//        System.out.println(("-------学院的员工-------"));
//        for (CollegeEmployee employee:list1) {// CollegeEmployee是SchoolManager的陌生类，并且是以局部变量的方式出现再了当前类中，违反了迪米特法则
//            System.out.println(employee.getId());
//        }
        sub.printCollegeEmployee();
    //  ⭐⭐⭐⭐-------迪米特法则 改进结束 -------⭐⭐⭐⭐ //


        System.out.println(("-------学校总部员工-------"));
        for (Employee employee:this.getAllEmployee()) {
            System.out.println(employee.getId());
        }
    }
    /*分析SchoolManager类的直接朋友都有哪些？
     * 🔹CollegeManager也是SchoolManager的直接朋友，因为pringAllEmployee(CollegeManager sub)里带了CollegeManager类的参数。
     * 🔹再看CollegeEmployee，是不是SchoolManager的直接朋友？
     *    不是。为什么不是？因为CollegeEmployee既不是SchoolManager的成员变量，
     *                   也不是SchoolManager类方法里的参数变量。
     *                   也不是SchoolManager类方法里的返回值。
     *  所以，CollegeEmployee违背类迪米特法则，CollegeEmployee是SchoolManager类的陌生类
     * ⭐⭐⭐⭐很重要！按照迪米特法则，应该避免类中出现这样非直接朋友(也就是陌生类)的耦合⭐⭐⭐
     * */
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
}
