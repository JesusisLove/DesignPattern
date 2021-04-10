package com.liu.design_3_model.behavior_08interpreter.expression.symbolExpression;

import com.liu.design_3_model.behavior_08interpreter.expression.AbstractExpression;

import java.util.HashMap;

/**
 * 运算符号的解析器，
 * 这里，每个运算符号都只和自己左右两个数字有关系
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是AbstractExpression类的实现类
 */

public class SymbolExpression extends AbstractExpression {
    protected AbstractExpression left;// 变量左边的表达式
    protected AbstractExpression right;// 变量右边的表达式

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //因为SymbolExpression是让其子类来实现，所以SymbolExpression的interpreter是一个默认的空实现，即什么都不要做。
        return 0;
    }
}
