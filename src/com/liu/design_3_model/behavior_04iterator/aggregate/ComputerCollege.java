package com.liu.design_3_model.behavior_04iterator.aggregate;

import com.liu.design_3_model.behavior_04iterator.Department;
import com.liu.design_3_model.behavior_04iterator.iterator.IteratorCollege;

import java.util.Iterator;

public class ComputerCollege implements IUniversity {
    private Department[] departments = new Department[3];

    // 构造器：在构造器里直接初始化3个系，添加到数组中
    public ComputerCollege() {
        departments[0] = new Department("计算可科学与技术", "始建于民国3年");
        departments[1] = new Department("软件工程", "始建于民国6年");
        departments[2] = new Department("网络工程", "始建于民国8年");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public Iterator createIterator() {
        Iterator iterator = new IteratorCollege(departments);
        return iterator;
    }
}
