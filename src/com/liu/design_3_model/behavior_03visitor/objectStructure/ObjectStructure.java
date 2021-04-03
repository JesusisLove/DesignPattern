package com.liu.design_3_model.behavior_03visitor.objectStructure;

import com.liu.design_3_model.behavior_03visitor.element.AbsPerson;
import com.liu.design_3_model.behavior_03visitor.visitor.AbsScoreAction;

import java.util.LinkedList;
import java.util.List;
/* 管理现场观众到对象结构体：管理在场的Male观众和Female观众 */
public class ObjectStructure {
    // 维护了一个集，盛放AbsPerson的子类对象
    private List<AbsPerson> personList = new LinkedList<>();

    // 增加到list
    public void attach(AbsPerson person) {
        personList.add(person);
    }
    // 移除
    public void detach(AbsPerson person) {
        personList.remove(person);
    }

    // 显示测评情况
    public void display(AbsScoreAction scoreaction) {
        for(AbsPerson p : personList) {
            p.accept(scoreaction);
        }
    }
}
