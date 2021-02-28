package com.liu.principle_002_Inversion.Inversion_OK.lianxi;

public class OpenAndClose implements IOpenAndClose{
    ITV tv;
    public void setTv(ITV tv) { // 通过setter传递依赖
        this.tv = tv;
    }
    public void open () {
        tv.play();
    }
    public void close () {
        tv.stop();
    }
}
