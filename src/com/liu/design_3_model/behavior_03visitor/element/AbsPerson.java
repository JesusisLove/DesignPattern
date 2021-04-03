package com.liu.design_3_model.behavior_03visitor.element;

import com.liu.design_3_model.behavior_03visitor.visitor.AbsScoreAction;
/* 被访问者抽象类，也就是接受访问者抽象类 */
public abstract class AbsPerson {
    // 对外提供可以访问本对象的一个抽象方法
    public abstract void accept(AbsScoreAction visitor);
}
