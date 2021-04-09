package com.liu.design_3_model.behavior_07memento.demo.memento;

public class Memento {
    private String state;

    // 构造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
