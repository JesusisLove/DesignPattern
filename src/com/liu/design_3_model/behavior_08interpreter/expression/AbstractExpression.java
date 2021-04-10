package com.liu.design_3_model.behavior_08interpreter.expression;

import java.util.HashMap;
/*
* 抽象类表达式，通过HashMap键值对可以获取到变量的值
*
* */
public abstract class AbstractExpression {
    /*
    * 解释公式和数值的一个关系【例如：a + b - c】，
    * key就是公式（表达式）参数【例如a,b,c等】;
    * value就是具体的值【例如3，2，1】
    * */
    public abstract int interpreter(HashMap<String, Integer> var);
}
