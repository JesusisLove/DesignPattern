package com.liu.design_3_model.behavior_03visitor.visitor;

import com.liu.design_3_model.behavior_03visitor.element.Female;
import com.liu.design_3_model.behavior_03visitor.element.Male;

/* 具体的访问者类 */
public class ScoreGood extends AbsScoreAction {
    // 访问者数据操作
    @Override
    public void getScoreFrom(Male male) {
        System.out.println("男人观众组的" + male.getName() + "给歌手评判结果是：Good！");
    }

    // 访问者数据操作
    @Override
    public void getScoreFrom(Female female) {
        System.out.println("女人观众组的" + female.getName() + "给歌手评判结果是：Good！");
    }
}