package com.liu.design_3_model.behavior_07memento.game.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * CareTaker：管理Memento备忘录的类
 * CareTaker职责就像一个托管所，专门托管Originator的备忘对象memento
 * memento对象是记录Originator对象，在某时刻的状态
 *
 * */
public class CareTaker {
    // 一个GameRole的一个状态对象
    private Memento memento;

    // List集合里收纳了一个GameRole角色的很多状态的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    // 对多个GameRole角色保存多个状态的备忘录对象
    private HashMap<String,List<Memento>> mementosMap = new HashMap<>();

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;

        // 作业：继续完善，使之gameRole角色可以根据时间的推移，恢复不同阶段的体力（比如，十个阶段，存了10个memento对象，根据指定的index，恢复相应的体力值）
        mementoList.add(memento);
    }
        // 作业：继续完善，使之若干个gameRole角色可以根据时间的推移，对若干个gameRole角色，各自恢复各自不同阶段的体力
    public void setMemento(String originatorName,Memento memento) {
        mementosMap.put(originatorName,mementoList);
    }
}
