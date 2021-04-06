package com.liu.design_3_model.behavior_04iterator.iterator;

import com.liu.design_3_model.behavior_04iterator.Department;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class IteratorInformation implements Iterator {
    // 这里需要明确知道Department是以怎样的方式存放的【这里是以List的方式存放】
    List<Department> departmentList;
    int index = -1;// 遍历List的索引位置

    // 构造器
    public IteratorInformation(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    /**
     * 判断是否还有下一个元素
     */
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size()-1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    /**
     * 返回当前对象
     */
    @Override
    public Object next() throws NoSuchElementException {
        return departmentList.get(index);
    }


    @Override
    public void remove() {

    }

}
