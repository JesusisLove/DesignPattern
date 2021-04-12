package com.liu.design_3_model.behavior_09state.raffleEvent.raffle_state;

import com.liu.design_3_model.behavior_09state.raffleEvent.raffle_activity.RaffleActivity;

/*
 * 奖品领完的状态
 * 说明：当我们activity改变成DispenseOver的状态是，就表示本次抽奖活动已经结束
 * */
public class DispenseOver implements IState {
    RaffleActivity activity;

    public DispenseOver(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("奖品领完的状态：抽奖活动已结束，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品领完的状态：抽奖活动已结束，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放已终止");
    }
}
