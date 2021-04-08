package com.liu.design_3_model.behavior_06mediator.smart_house.mediator;

import com.liu.design_3_model.behavior_06mediator.smart_house.colleague.*;

import java.util.HashMap;
/* 具体的中介者类:中介者是系统业务流程的枢纽
*
* Java中的MVC模式，C-controller控制中心，就是一个中介者类
* ConcreteMediator就相当于MVC中的Controller
*
* */
public class ConcreteMediator extends Mediator {
    // 集合，放入所有的同事对象
    HashMap<String, Colleague>colleagueMap = new HashMap<>();

    // 集合，登记所有装入colleagueMap的同事对象
    HashMap<String,String>interMap = new HashMap<>();

    // 将同事对象添加到中介者对象的一个HashMap中去
    @Override
    public void register(String colleagueName, Colleague colleague) {
        // 收纳各样的同事类对象到colleagueMap集合
        colleagueMap.put(colleagueName,colleague);

        // 登记各样的同事类对象到interMap集合
        if (colleague instanceof Alarm) {
            interMap.put("Alarm",colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine",colleagueName);
        }else if (colleague instanceof TV) {
            interMap.put("TV",colleagueName);
        }else if (colleague instanceof Curtains) {
            interMap.put("Curtains",colleagueName);
        }
    }

    /* 接收消息：接收一个具体的同事对象发出的消息
    * 中介者的核心方法
    * 1.根据得到的消息，完成对应的任务
    * 2.中介者在此方法中，协调各个具体的同事类对象完成任务
    * */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        /* 若是闹钟发出来的消息，执行下面处理 */
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                // 开始煮咖啡
                ((CoffeeMachine)colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                // 打开电视开始播放
                ((TV)colleagueMap.get(interMap.get("TV"))).startTV();
            } else if (stateChange == 1) {
                // 关闭电视
                ((TV)colleagueMap.get(interMap.get("TV"))).stopTV();
            }
        /* 若是咖啡机发出来的消息，执行下面处理 */
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            if (stateChange == 1) {
                ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
            } else {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).finishCoffee();
                ((Curtains) colleagueMap.get(interMap.get("Curtains"))).downCurtains();
            }
        /* 若是TV发出来的消息，执行下面处理 */
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            ((Curtains)colleagueMap.get(interMap.get("Curtains"))).downCurtains();

        /* 若是Curtains发出来的消息，执行下面处理 */
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            if (stateChange == 0) {
                // 把窗帘拉上去
                ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
            } else if (stateChange == 1) {
                // 把窗帘拉下来
                ((Curtains) colleagueMap.get(interMap.get("Curtains"))).downCurtains();
            }
        }
    }

    // 发出消息：中介者发出的消息
    @Override
    public void sendMessage() {
        // 省略
    }
}
