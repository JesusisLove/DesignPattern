package com.liu.design_3_model.behavior_09state.raffleEvent.raffle_state;
/*
* 状态接口
* */
public interface IState {
    // 扣除相应的积分才可以去抽奖
    public void reduceMoney();

    // 是否抽中了奖品
    public boolean raffle();

    // 发放奖品
    public void dispensePrize();
}
