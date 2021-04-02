package com.liu.design_3_model.behavior_02command.invoker;

import com.liu.design_3_model.behavior_02command.command.NoneCommand;
import com.liu.design_3_model.behavior_02command.command.ICommand;

/*  调用者角色（相当于将军） */
public class RemoteController {
    // 开关按钮数组
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    // 执行撤销命令
    private ICommand undoCommand;

    // 构造器，完成对按钮的初始化
    public RemoteController() {
        onCommands = new ICommand[8];
        offCommands = new ICommand[8];

        // 初始化每一个开关按钮
        for (int i=0; i<8; i++) {
            onCommands[i] = new NoneCommand();
            offCommands[i] = new NoneCommand();
        }
    }

    // 给我们的按钮设置我们需要的命令
    public void setCommand(int index,ICommand onCommand,ICommand offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    // 按下遥控器上的「开」按钮
    public void buttonOn(int index) {
        // 按下对象按钮，执行对象按钮的excute()操作
        onCommands[index].execute();
        // 记录这次的操作，好用来撤销
        undoCommand = onCommands[index];
    }

    // 按下遥控器上的「关」按钮
    public void buttonOff(int index) {
        // 按下对象按钮，执行对象按钮的excute()操作
        offCommands[index].execute();
        // 记录这次的操作，好用来撤销
        undoCommand = offCommands[index];
    }

    // 按下遥控器上的「撤销」按钮
    public void buttonUndo() {
        undoCommand.undo();
    }

}
