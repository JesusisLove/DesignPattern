package com.liu.design_3_model.behavior_07memento.game.memento;

public class Memento {
    private int attect;
    private int defence;

    // 构造器
    public Memento(int attect, int defence) {
        this.attect = attect;
        this.defence = defence;
    }

    public int getAttect() {
        return attect;
    }

    public void setAttect(int attect) {
        this.attect = attect;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
