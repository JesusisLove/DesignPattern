package com.liu.design_3_model.behavior_09state.moneyLending.state;

import com.liu.design_3_model.behavior_09state.moneyLending.StateEnum;
import com.liu.design_3_model.behavior_09state.moneyLending.activity.Context;

/*
* 根据流程图，定义六个状态类
* */

// 订单产生
class GenerateState extends AbstractState {
    /* 电审审核 */
    @Override
    public void checkEvent(Context context) {
        // 根据业务流程图看，执行电审审核操作，将状态改变成已审核状态
        context.setState(new ReviewState());
    }

    /* 审核失败 */
    @Override
    public void checkFailEvent(Context context) {
        // 根据业务流程图看，执行审核失败操作，将状态改变成已完结状态
        context.setState(new OverState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENARATE_STATE.getValue();
    }
}

// 已审核
class ReviewState extends AbstractState {
    @Override
    public void makePriceEvent(Context context) {
        // 根据业务流程图看，执行定价发布操作，将状态改变成已发布状态
        context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEW_STATE.getValue();
    }
}

// 已发布
class PublishState extends AbstractState {
    @Override
    public void acceptOrderEvent(Context context) {
        // 根据业务流程图看，执行接单操作，将状态改变成待付款状态
        context.setState(new NotPayState());
    }

    @Override
    public void nonePeopleAcceptEvent(Context context) {
        // 根据业务流程图看，执行无人接单操作，将状态改变成已完结状态
        context.setState(new OverState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISH_STATE.getValue();
    }
}

//待付款
class NotPayState extends AbstractState {

    /* 付款 */
    @Override
    public void payOrderEvent(Context context) {
        // 根据业务流程图看，执行付款操作，将状态改变成已付款状态
        context.setState(new PaidState());
    }

    /* 接单有人支付失效 */
    @Override
    public void orderFailureEvent(Context context) {
        // 根据业务流程图看，接单有人支付失效操作，将状态改变成已审核状态
        context.setState(new OverState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOTPAY_STATE.getValue();
    }
}

// 已付款
class PaidState extends AbstractState {
    @Override
    public void feedBackEvent(Context context) {
        // 根据业务流程图看，执行反馈操作，将状态改变成已审核状态
        context.setState(new OverState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PAID_STATE.getValue();
    }
}

// 已完结
class OverState extends AbstractState {
    @Override
    public String getCurrentState() {
        return StateEnum.OVERS_STATE.getValue();
    }
}