package com.liu.design_3_model.behavior_07memento.demo.originator;

import com.liu.design_3_model.behavior_07memento.demo.memento.Memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 编写一个方法，可以保存Originator对象状态的对象(Memento对象)，并返回Memento对象
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    // 通过备忘录对象恢复状态
    public void getMementoState(Memento memento) {
        this.state = memento.getState();
    }
}
