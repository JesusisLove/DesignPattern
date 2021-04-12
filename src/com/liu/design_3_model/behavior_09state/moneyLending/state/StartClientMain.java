package com.liu.design_3_model.behavior_09state.moneyLending.state;

import com.liu.design_3_model.behavior_09state.moneyLending.activity.Context;
import com.liu.design_3_model.behavior_09state.moneyLending.state.PublishState;

public class StartClientMain {
    public static void main(String[] args) {
        // 创建一个上下文Context类对象
        Context context = new Context();

        // 将当前状态设置为PublishState(已发布状态)
        context.setState(new PublishState());

        // 已发布状态--->待付款状态
        context.acceptOrderEvent(context);

        // 待付款状态--->已付款状态
        context.payOrderEvent(context);

        // 套上try-catch块，检测业务流程是否正常
        try {
            context.checkFailEvent(context);
            System.out.println("流程正常");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
