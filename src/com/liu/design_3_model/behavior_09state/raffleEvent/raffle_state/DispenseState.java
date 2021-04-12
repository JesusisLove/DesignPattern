package com.liu.design_3_model.behavior_09state.raffleEvent.raffle_state;

import com.liu.design_3_model.behavior_09state.raffleEvent.raffle_activity.RaffleActivity;

/*
 * 发放奖品的状态
 * */
public class DispenseState implements IState {
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("发放奖品的状态：不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("发放奖品的状态：不能再抽奖了");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("正在领奖品。。。");
        if (activity.getCount() > 0) {
            System.out.println("发放奖品的状态：恭喜您获得奖品。。。");
            // 奖品发放完之后，将状态设置为不能抽奖的状态
            activity.setState(activity.getRds());
        } else {
            System.out.println("发放奖品的状态：奖品已发放完！");
            // 奖品发放完，将状态设置为奖品领完的状态
            // activity.setState(activity.getDpo());
            // 既然奖品已经发放完了，也就没有必要在继续抽奖了，所以直接退出程序
            System.exit(0);
        }

    }
}
