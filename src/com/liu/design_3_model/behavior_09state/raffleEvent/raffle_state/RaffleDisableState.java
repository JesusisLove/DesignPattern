package com.liu.design_3_model.behavior_09state.raffleEvent.raffle_state;

import com.liu.design_3_model.behavior_09state.raffleEvent.raffle_activity.RaffleActivity;

/*
* 不能抽奖的状态
* */
public class RaffleDisableState implements IState {
    // 初期化是传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public RaffleDisableState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分
    @Override
    public void reduceMoney() {
        System.out.println("发放奖品的状态：不能抽奖的状态：扣除50分积分成功，您可以抽奖了");
        // 扣分操作正常完成后，将状态设置成可以抽奖的状态。
        activity.setState(activity.getRes());
    }

    // 当前状态不可抽奖
    @Override
    public boolean raffle() {
        System.out.println("发放奖品的状态：扣了积分才能抽奖的哦");
        return false;
    }

    // 当前状态不能执行发放奖品这个动作
    @Override
    public void dispensePrize() {
        System.out.println("发放奖品的状态：不能发放奖品");

    }
}
