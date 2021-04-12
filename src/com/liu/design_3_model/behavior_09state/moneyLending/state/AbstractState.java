package com.liu.design_3_model.behavior_09state.moneyLending.state;

import com.liu.design_3_model.behavior_09state.moneyLending.activity.Context;

/*
* AbstractState类 默认实现了IState接口的所有方法
* 用抽象类默认接口所有方法的好处是
*   有的子类不需要实现IState的时候，可以不用去实现
*   有的子类需要实现IState接口方法的时候，直接覆盖AbstractState类的相应方法
*   好处：子类用到什么方法就去选择性地覆盖父类方法好了
*        不用被迫强制实现所有IState的方法，因为所有方法父类都已经实现了
*        根据子类自身业务需要，选择性地实现方法，很方便。
* */
public abstract class AbstractState implements IState {

    // 如果子类没有实现就直接调用相应的方法的时候，就会抛EXCEPTION异常。
    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void nonePeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }

    public String getCurrentState() {
        return "";
    }
}
