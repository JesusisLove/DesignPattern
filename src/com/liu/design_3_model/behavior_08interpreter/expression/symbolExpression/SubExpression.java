package com.liu.design_3_model.behavior_08interpreter.expression.symbolExpression;

import com.liu.design_3_model.behavior_08interpreter.expression.AbstractExpression;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {
    public SubExpression(AbstractExpression left, AbstractExpression right) {
        super(left,right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
