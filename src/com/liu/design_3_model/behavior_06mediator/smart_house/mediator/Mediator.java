package com.liu.design_3_model.behavior_06mediator.smart_house.mediator;

import com.liu.design_3_model.behavior_06mediator.smart_house.colleague.Colleague;

public abstract class Mediator {
    public abstract void register(String colleagueName, Colleague colleague);
    public abstract void getMessage(int stateChange, String colleagueName);
    public abstract void sendMessage();

}
