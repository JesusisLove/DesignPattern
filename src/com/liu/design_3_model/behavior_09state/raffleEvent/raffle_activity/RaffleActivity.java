package com.liu.design_3_model.behavior_09state.raffleEvent.raffle_activity;

import com.liu.design_3_model.behavior_09state.raffleEvent.raffle_state.*;

/*
* RaffleActivity类为环境角色，用与维护State实例，这个实例定义抽奖活动多有环节的状态。
* 各个状态子类也含有ReffleActivity对象
* */
public class RaffleActivity {

    // state 表示活动当前的状态，这个状态是随着条件变化的【如水：零度以下：固态冰；常温：液态水；100度：气态蒸汽】
    IState state = null;
    // 奖品数量
    int count = 0;

    // 抽奖活动的四个状态属性
    RaffleEnableState res = new RaffleEnableState(this);
    RaffleDisableState rds = new RaffleDisableState(this);
    DispenseState dps = new DispenseState(this);
    DispenseOver dpo = new DispenseOver(this);

    // 构造器 初始化当前的状态为不能抽奖的状态以及奖品的数量
    public RaffleActivity(int count) {
        this.state = getRds();
        this.count = count;
    }
    // 扣分，调用当前状态的deduceMoney
    public void doReduceMoney() {
        state.reduceMoney();
    }

    // 抽奖
    public void doRaffle() {
        // 如果当前的状态是抽奖成功
        if (state.raffle()) {
            // 领取奖品
            state.dispensePrize();
        }
    }

    public IState getState() {
        return state;
    }

    // 因为每领一次奖品，数量就-1个
    public int getCount() {
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public RaffleEnableState getRes() {
        return res;
    }

    public RaffleDisableState getRds() {
        return rds;
    }

    public DispenseState getDps() {
        return dps;
    }

    public DispenseOver getDpo() {
        return dpo;
    }
}
