package com.liu.design_3_model.behavior_07memento.demo;

import com.liu.design_3_model.behavior_07memento.demo.memento.CareTaker;
import com.liu.design_3_model.behavior_07memento.demo.originator.Originator;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("status_#1：攻击力 100");
        // 保存了originator当前的状态#1
        careTaker.add(originator.saveStateMemento());

        System.out.println("--- 对抗了2分钟 ---");
        originator.setState("status_#2：攻击力 60");
        // 保存了originator当前的状态#2
        careTaker.add(originator.saveStateMemento());

        System.out.println("--- 对抗了3分钟 ---");
        originator.setState("status_#3：攻击力 20");
        // 保存了originator当前的状态#3
        careTaker.add(originator.saveStateMemento());

        System.out.println("～～～ 当前状态是； ～～～" + originator.getState());

        // GameOver之后，又过了10分钟，攻击力恢复到了 #2的状态
        System.out.println("=== GameOver之后，又过了10分钟，攻击力恢复到了 #2的状态 ===");
        originator.getMementoState(careTaker.get(1));
        System.out.println("～～～ 当前状态是； ～～～" + originator.getState());
    }
}
