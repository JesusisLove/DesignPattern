package com.liu.design_3_model.behavior_04iterator.aggregate;

import com.liu.design_3_model.behavior_04iterator.Department;
import com.liu.design_3_model.behavior_04iterator.iterator.IteratorCollege;
import com.liu.design_3_model.behavior_04iterator.iterator.IteratorInformation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InformationCollege implements IUniversity {
    List<Department> departmentList;

    // 构造器：在构造器里直接初始化3个系，添加到数组中
    public InformationCollege() {
        departmentList = new ArrayList<>();
        departmentList.add(new Department("通讯工程","始建于民国4年"));
        departmentList.add(new Department("网络工程","始建于民国9年"));
    }
    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public Iterator createIterator() {
        Iterator iterator = new IteratorInformation(departmentList);
        return iterator;
    }
}
