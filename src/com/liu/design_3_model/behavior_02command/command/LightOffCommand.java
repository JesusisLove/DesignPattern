package com.liu.design_3_model.behavior_02command.command;

import com.liu.design_3_model.behavior_02command.receiver.LightReceiver;

/*
*   具体命名角色（相当于具体的军令牌）
*   例如本例，对Light的接收者
*   本命令只执行Light的关灯操作和撤销关灯的操作
*
* */
public class LightOffCommand implements ICommand {
    // 聚合LightReceiver
    LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        System.out.println("↓↓↓↓执行了撤销操作，恢复到了下面的状态↓↓↓↓");
        receiver.on();
    }
}
