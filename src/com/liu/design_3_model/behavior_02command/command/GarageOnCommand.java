package com.liu.design_3_model.behavior_02command.command;

import com.liu.design_3_model.behavior_02command.receiver.CarGarageReceiver;
import com.liu.design_3_model.behavior_02command.receiver.LightReceiver;

/*
 *   具体命名角色（相当于具体的军令牌）
 *   例如本例，对CarGarageReceiver的接收者
 *   本命令只执行CarGarageReceiver的打开车库门的操作和撤销打开车库门的操作
 *
 * */
public class GarageOnCommand implements ICommand {
    // 聚合CarGarageReceiver
    CarGarageReceiver receiver;

    public GarageOnCommand(CarGarageReceiver receiver) {
        this.receiver = receiver;
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
