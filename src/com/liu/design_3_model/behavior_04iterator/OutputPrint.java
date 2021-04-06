package com.liu.design_3_model.behavior_04iterator;

import com.liu.design_3_model.behavior_04iterator.aggregate.IUniversity;

import java.util.Iterator;
import java.util.List;

public class OutputPrint {
    // 学院集合
    List<IUniversity> collegeList;

    // 构造器
    public OutputPrint(List<IUniversity> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院
    public void startPrint() {
        // 方法一：遍历List，从List集合里取出学院到对象
        for(IUniversity college:collegeList) {
            System.out.println("======= 学院名称：" + college.getName() + " =======");
            // 将学院到迭代器传递给printCollege方法
            this.printCollege(college.createIterator());
        }

        /* 方法二：Java里的List和可以直接返回学院collegeList的iterator（Java基础知识）
        Iterator<IUniversity> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            IUniversity college = iterator.next();
            this.printCollege(college.createIterator());
        }*/
    }

    // 输出学院输出系
    private void printCollege(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
