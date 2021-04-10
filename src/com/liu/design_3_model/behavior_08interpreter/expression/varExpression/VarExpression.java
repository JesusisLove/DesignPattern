package com.liu.design_3_model.behavior_08interpreter.expression.varExpression;

import com.liu.design_3_model.behavior_08interpreter.expression.AbstractExpression;

import java.util.HashMap;
/*
* 变量的解析器
*
* */
public class VarExpression extends AbstractExpression {
    private String key;// 这个key里放的是变量名【例如key = a, 或者是b,或者是c】

    public VarExpression(String key) {
        this.key = key;
    }

    /*
    * var 就是{a=10,b=20}
    * interpreter要做的事情就是，根据变量名称，返回对应的值【比如，如果key是a，返回的值就是10】
    * */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
