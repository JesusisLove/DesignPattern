package com.liu.principle_002_Inversion_OK.lianxi;

import com.liu.principle_002_Inversion_OK.lianxi.ITV;

public interface IOpenAndClose {
    public void setTv(ITV tv);// 通过setter传递依赖
    public void open();
    public void close();
}
