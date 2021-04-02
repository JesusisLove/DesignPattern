package com.liu.design_3_model.behavior_02command.command;

/*  命令角色（相当于一个军令牌，军令派里有下达的命令） */
public interface ICommand {
    // 执行某个操作的命令
    public void execute();
    // 撤销某个操作的命令
    public void undo();
}
