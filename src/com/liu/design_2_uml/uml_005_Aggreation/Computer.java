package com.liu.design_2_uml.uml_005_Aggreation;

/*
* 聚合关系表示的是整体和部分的关系，整体与部分可以分开。
* 聚合关系是关联关系的特例，所以它具有关联的导航性与多重性。
* */

public class Computer {
    private Mouse mouse; // 鼠标可以和电脑分离而单独存在
    private KeyBoard keyBoard; // 键盘可以和电脑分离而单独存在
    private Monitor monitor; // 显示器可以和电脑分离而单独存在

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
