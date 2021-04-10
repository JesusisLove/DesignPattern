package com.liu.design_3_model.behavior_08interpreter.expression.symbolExpression;

import com.liu.design_3_model.behavior_08interpreter.expression.AbstractExpression;

import java.util.HashMap;
/*
* 加法解释器
*
* */
public class AddExpression extends SymbolExpression {
    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left,right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {// var是{a=10,b=20}
        /* 做具体的相加处理
        * super.left.interpreter(var):返回left表达式对应的值 a=10
        * super.right.interpreter(var):返回right表达式对应的值 b=20
        * */
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
