package com.liu.design_3_model.behavior_02command.command;

import com.liu.design_3_model.behavior_02command.receiver.LightReceiver;

/*
 *   具体命名角色（相当于具体的军令牌）
 *   例如本例，对Light的接收者
 *   本命令只执行Light的开灯操作和撤销开灯的操作
 *
 * */
public class LightOnCommand implements ICommand {
    // 聚合LightReceiver
    LightReceiver receiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.receiver = lightReceiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        System.out.println("执行了撤销操作，恢复到：下面的状态↓↓↓↓");
        receiver.off();
    }
}
