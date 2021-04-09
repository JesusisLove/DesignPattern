package com.liu.design_3_model.behavior_07memento.game.originator;

import com.liu.design_3_model.behavior_07memento.game.memento.Memento;
import org.jetbrains.annotations.NotNull;

public class GameRole {
    private int attect;
    private int defence;

    // 根据游戏进行的当前状态得到当前GameRole对象的一个Memento对象
    public Memento createMemento() {
        Memento currentMoment = new Memento(this.attect,this.defence);
        return currentMoment;
    }

    // 从备忘录对象中恢复GameRole最近一次的状态
    public void recoverGameRole(@NotNull Memento memento) {
        this.attect = memento.getAttect();
        this.defence = memento.getDefence();
    }

    // 从备忘录数组中恢复GameRole的某个时刻的状态
    public void recoverGameRole(int index) {

    }

    // 显示当前游戏角色的状态
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.attect +"===" + "游戏角色当前的防御力：" + this.defence);
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
