package com.liu.principle_002_Inversion.Inversion_OK.lianxi;

public interface IOpenAndClose {
    public void setTv(ITV tv);// 通过setter传递依赖
    public void open();
    public void close();
}
