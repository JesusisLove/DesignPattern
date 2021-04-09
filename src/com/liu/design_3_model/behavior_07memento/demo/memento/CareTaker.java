package com.liu.design_3_model.behavior_07memento.demo.memento;

import java.util.ArrayList;
import java.util.List;

/*
 * CareTaker：管理Memento备忘录的类
 * CareTaker职责就像一个托管所，专门托管Originator的备忘对象memento
 * memento对象是记录Originator对象，在某时刻的状态
 *
 * */
public class CareTaker {
    //List集合里收纳了很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    // 获取到第index个Originator的备忘录对象（保存memento对象的状态）
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
