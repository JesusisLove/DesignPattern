package com.liu.design_3_model.behavior_06mediator.smart_house.colleague;

import com.liu.design_3_model.behavior_06mediator.smart_house.mediator.Mediator;

// 同事抽象类
public abstract class Colleague {

    private Mediator mediator;// 同事抽象类（Colleague）与中介者抽象类（Mediator）发送关联关系
    public String colleagueName;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.colleagueName = name;
    }

    public abstract void sendMessage(int stateChange);

    public Mediator getMediator() {
        return this.mediator;
    }
}
