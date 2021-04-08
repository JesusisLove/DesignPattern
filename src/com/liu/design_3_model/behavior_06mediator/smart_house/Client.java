package com.liu.design_3_model.behavior_06mediator.smart_house;

import com.liu.design_3_model.behavior_06mediator.smart_house.colleague.Alarm;
import com.liu.design_3_model.behavior_06mediator.smart_house.colleague.CoffeeMachine;
import com.liu.design_3_model.behavior_06mediator.smart_house.colleague.Curtains;
import com.liu.design_3_model.behavior_06mediator.smart_house.colleague.TV;
import com.liu.design_3_model.behavior_06mediator.smart_house.mediator.ConcreteMediator;
import com.liu.design_3_model.behavior_06mediator.smart_house.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        // 创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm对象，并将该对象加入到ConcreteMediator对象的HashMap集合里去
        Alarm alarm = new Alarm(mediator,"alarm");

        //创建CoffeeMachine对象，并将该对象加入到ConcreteMediator对象的HashMap集合里去
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,"coffeeMachine");

        //创建TV对象，并将该对象加入到ConcreteMediator对象的HashMap集合里去
        TV tv = new TV(mediator,"tv");
        Curtains curtains = new Curtains(mediator,"curtains");

        // 让alarm发送一个消息
        alarm.sendAlarm(0);

        // 让coffeeMachine发送一个消息
        coffeeMachine.sendCoffeeMachine(0);

        // 让alarm发送一个消息
        alarm.sendAlarm(1);
    }
}
