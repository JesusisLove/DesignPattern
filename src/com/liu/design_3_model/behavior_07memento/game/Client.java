package com.liu.design_3_model.behavior_07memento.game;

import com.liu.design_3_model.behavior_07memento.game.memento.CareTaker;
import com.liu.design_3_model.behavior_07memento.game.originator.GameRole;

public class Client {
    public static void main(String[] args) {
        // 🔹创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setAttect(100);
        gameRole.setDefence(100);
        System.out.println("------- 和Boss大战前的状态 -------");
        gameRole.display();

        // 🔹创建一个备忘托管所
        CareTaker careTaker = new CareTaker();
        // 把当前状态的gameRole做一个Memento备忘，并将其托付给careTaker来保管
        careTaker.setMemento(gameRole.createMemento());

        System.out.println("------- 和Boss开始大战。。。大战5分钟之后 -------");
        gameRole.setAttect(30);
        gameRole.setDefence(28);
        gameRole.display();
        careTaker.setMemento(gameRole.createMemento());

        System.out.println("------- 和Boss开始大战。。。大战2分钟之后 -------");
        gameRole.setAttect(0);
        gameRole.setDefence(0);
        gameRole.display();

        System.out.println("------- 和Boss停战，休息。。。。10分钟之后 -------");
        // 🔹大战后休息，从备忘中恢复gameRole最近一次的状态
        gameRole.recoverGameRole(careTaker.getMemento());
        gameRole.display();




    }
}
