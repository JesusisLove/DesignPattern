package com.liu.principle_002_Inversion.Inversion_OK;

import com.liu.principle_002_Inversion.Inversion_OK.lianxi.OpenAndClose;
import com.liu.principle_002_Inversion.Inversion_OK.lianxi.PanasonicTV;
import com.liu.principle_002_Inversion.Inversion_OK.lianxi.SonyTV;

public class MainCls {
    public static void main(String[] arge){
        executeInversion_OK();
    }

    // 依赖倒转原则：因为Person类依赖了接口，具体的细节在新追加的具体通讯类里实现。如果追加了1000种通讯类，因为有了接口依赖，就不需要再Person类里再追加1000个方法的代码了
    static void executeInversion_OK() {
        Person_OK_Pattern p = new Person_OK_Pattern();
        p.receive(new Community_Email());
        p.receive(new Community_LINE());

        //⭐️⭐️⭐️⭐️⭐️⭐️⭐️
        OpenAndClose oac = new OpenAndClose();
        SonyTV sony = new SonyTV();
        oac.setTv(sony);
        oac.open();
        oac.close();

        PanasonicTV panasonic = new PanasonicTV();
        oac.setTv(panasonic);
        oac.open();
        oac.close();
    }
}
