package com.liu.design_3_model.behavior_02command;

import com.liu.design_3_model.behavior_02command.command.*;
import com.liu.design_3_model.behavior_02command.invoker.RemoteController;
import com.liu.design_3_model.behavior_02command.receiver.CarGarageReceiver;
import com.liu.design_3_model.behavior_02command.receiver.LightReceiver;

public class StartClient {
    public static void main(String[] args) {
        // 创建遥控器（调用者角色：将军，命令的发布者）
        RemoteController remoteController = new RemoteController();


        // 创建家电之--电灯（接收者角色：士兵，命令的执行者）
        LightReceiver lightReceiver = new LightReceiver();
        // 创建一个打开电灯的命令（命令角色：军令牌--执行开灯任务）
        ICommand lightOnCommand = new LightOnCommand(lightReceiver);
        // 创建一个打开电灯的命令（命令角色：军令牌--执行关灯任务）
        ICommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 给遥控器设置相关命令
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        // 遥控器发布遥控命令
        remoteController.buttonOn(0);
        remoteController.buttonOff(0);
        remoteController.buttonUndo();

        // 创建家电之--车库的大门，用来打开和关闭车库门
        CarGarageReceiver carGarageReceiver = new CarGarageReceiver();
        // 创建一个打开车库门的命令（命令角色：军令牌--打开车库门的任务）
        ICommand garageOnCommand = new GarageOnCommand(carGarageReceiver);
        // 创建一个关闭车库门的命令（命令角色：军令牌--关闭车库门的任务）
        ICommand garageOffCommand = new GarageOffCommand(carGarageReceiver);
        // 给遥控器设置相关命令
        remoteController.setCommand(1, garageOnCommand, garageOffCommand);
        // 遥控器发布遥控命令
        remoteController.buttonOn(1);
        remoteController.buttonOff(1);
        remoteController.buttonUndo();


    }
}
