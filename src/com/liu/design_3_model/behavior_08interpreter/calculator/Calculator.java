package com.liu.design_3_model.behavior_08interpreter.calculator;

import com.liu.design_3_model.behavior_08interpreter.expression.AbstractExpression;
import com.liu.design_3_model.behavior_08interpreter.expression.symbolExpression.AddExpression;
import com.liu.design_3_model.behavior_08interpreter.expression.symbolExpression.SubExpression;
import com.liu.design_3_model.behavior_08interpreter.expression.varExpression.VarExpression;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    // 定义表达式
    private AbstractExpression expression;

    // 构造器，传递参数并解析
    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<AbstractExpression> stack = new Stack<>();
        // 将表达式拆分成字符串数组
        char[] charArray = expStr.toCharArray();

        AbstractExpression left = null;
        AbstractExpression right = null;

        // 变量charArray数组【比如charArray = {a, +, b}】，并针对字符串数组中的元素做相应的处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+'://
                    left = stack.pop();// 把左边的表达是弹出来 =>'a'。
                    right = new VarExpression(String.valueOf(charArray[++i]));// 创建一个右表达式=>'b'
                    // 根据构建到的left和right，去new一个执行加法运算的解释器，并push到stack里面去
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();//
                    right = new VarExpression(String.valueOf(charArray[++i]));//
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    // 如果是var变量【如a或者b或者c，那么，就创建VarExpression对象，并把它push到stack里去
                    stack.push(new VarExpression(String.valueOf(charArray[i])));//
                    break;
            }
        }
        // 当变量完整个charArray数组后，stack就得到里最后的运算表达式
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var){
        // 最后将表达式和var绑定，然后传递给expression的interpreter方法，进行解释执行
        return this.expression.interpreter(var);
    }


}
