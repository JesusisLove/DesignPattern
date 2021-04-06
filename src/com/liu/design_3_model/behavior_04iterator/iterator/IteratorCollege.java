package com.liu.design_3_model.behavior_04iterator.iterator;

import com.liu.design_3_model.behavior_04iterator.Department;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class IteratorCollege implements Iterator {
    // 这里需要明确知道Department是以怎样的方式存放的【这里是以数组的方式存放】
       Department[] departments;
    int index = 0;// 数组遍历索引位置

    // 构造器
    public IteratorCollege(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     */
    @Override
    public boolean hasNext() {
        if(index >= departments.length || departments[index] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 返回当前对象
     */
    @Override
    public Object next() {
        Department department = departments[index];
        index += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
