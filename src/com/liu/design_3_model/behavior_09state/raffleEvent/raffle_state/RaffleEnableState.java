package com.liu.design_3_model.behavior_09state.raffleEvent.raffle_state;

import com.liu.design_3_model.behavior_09state.raffleEvent.raffle_activity.RaffleActivity;

import java.util.Random;

/*
 * 可以抽奖的状态
 * */
public class RaffleEnableState implements IState {
    // 初期化是传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;
    boolean isDispensable = false;

    public RaffleEnableState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 已经扣除积分，不能再扣
    @Override
    public void reduceMoney() {
        System.out.println("可以抽奖的状态：已经扣过了积分");
    }

    // 可以抽奖，根据中奖结果设置状态：中奖，设置成可以去领奖品的状态。没中，设置成不能抽奖的状态。
    @Override
    public boolean raffle() {
        System.out.println("可以抽奖的状态：正在抽奖，请稍等。。。");
        Random random = new Random();
        int num = random.nextInt(10);
        // 10%中奖机会
        if (num == 0) { // 把0设置为中奖号码（当然0-9的数字可以任意设置）
            // 因为中奖了，改变其活动状态，可以去领奖品
            System.out.println("可以抽奖的状态：恭喜您中奖了，您可以去领奖品。。。");
            activity.setState(activity.getDps());
            isDispensable = true;
            return true;
        } else {
            // 因为没中奖，改变其活动状态，不能再抽奖的状态了（除非再可以扣除50积分）
            System.out.println("可以抽奖的状态：很遗憾没有中奖！期待您下次再来。。。");
            activity.setState(activity.getRds());
            isDispensable = false;
        }
        return isDispensable;
    }

    /* 根据中奖情况，做一些相关的业务逻辑处理
    * 比如，如果中奖了的客户：需要登记证件信息等等
    *      对应没有中奖的客户，可能发个商品优惠券等等的其他业务处理
    * */
    @Override
    public void dispensePrize() {
        if (isDispensable == true)
            System.out.println("可以抽奖的状态：恭喜您，您可以去领奖品了。。。");
        else
            System.out.println("可以抽奖的状态：抱歉，您没有中奖，不能领奖品。。。");
    }
}
