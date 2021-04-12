package com.liu.design_3_model.behavior_09state.raffleEvent;

import com.liu.design_3_model.behavior_09state.raffleEvent.raffle_activity.RaffleActivity;

public class Clinet {
    public static void main(String[] args) {
        // 创建活动对象，奖品池有5个奖品
        final int count = 5;
        RaffleActivity activity = new RaffleActivity(count);

        for (int i = 0; i < 300; i++) {
            System.out.println("------- 第" + (i + 1) +"次抽奖 -------");
            // 参加抽奖，
            // 第一步 扣除积分
            activity.doReduceMoney();

            // 第二步 抽奖
            activity.doRaffle();
        }
    }
}
