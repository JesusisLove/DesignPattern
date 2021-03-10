package com.liu.design_1_principle.principle_002_Inversion.Inversion_OK.lianxi;

import com.liu.design_1_principle.principle_002_Inversion.Inversion_OK.lianxi.ITV;

public interface IOpenAndClose {
    public void setTv(ITV tv);// 通过setter传递依赖
    public void open();
    public void close();
}
