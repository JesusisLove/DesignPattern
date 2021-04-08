package com.liu.design_3_model.behavior_06mediator.smart_house.colleague;

import com.liu.design_3_model.behavior_06mediator.smart_house.mediator.Mediator;

// 同事具体类
public class TV extends Colleague {
    /*
    * mediator:中介者
    * name：告诉中介者自己是谁？（比如我是alarm）
    * */
    public TV(Mediator mediator, String name) {
        super(mediator,name);
        // 去中介公司，把自己注册到Mediator的实例子类对象中去：如果传进来的Mediator的子类是ConcreteMediator，
        // 则将Alarm对象放到ConcreteMediator的HashMap里面去
        mediator.register(name,this);
    }

    public void sendTV(int stageChange) {
        sendMessage(stageChange);
    }
    @Override
    public void sendMessage(int stateChange) {
        // 拿到中介者对象，并调用中介者对象的getMessage方法
        this.getMediator().getMessage(stateChange,this.colleagueName);
    }

    public void startTV() {
        System.out.println("打开电视，看电视。。。。");
    }

    public void stopTV() {
        System.out.println("关闭电视。。。。");
    }
}
