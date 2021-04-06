package com.liu.design_3_model.behavior_04iterator.aggregate;

import java.util.Iterator;

public interface IUniversity {
    public String getName();

    // 返回一个迭代器
    public Iterator createIterator();
}
