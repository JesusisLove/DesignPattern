package com.liu.design_3_model.behavior_03visitor.visitor;

import com.liu.design_3_model.behavior_03visitor.element.Female;
import com.liu.design_3_model.behavior_03visitor.element.Male;

/* 抽象的访问者类 */
public abstract class AbsScoreAction {
    // 声明visitor的访问者操作,Male和Female是被访问者类（接受访问者类）
    public abstract void getScoreFrom(Male male);
    public abstract void getScoreFrom(Female feMale);

}
