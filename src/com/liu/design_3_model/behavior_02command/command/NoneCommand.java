package com.liu.design_3_model.behavior_02command.command;

import com.liu.design_3_model.behavior_02command.command.ICommand;

/*
*  为什么要用NoneCommand这么一个类
*  空执行，用于初始化遥控器的每个开关按钮
*  当调用空命令时，对象什么都不做
*  这样做的好处可以省掉对空对判断，这么说好像不知道再说什么，直接看代码就会明白了
*
* */
public class NoneCommand implements ICommand {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
