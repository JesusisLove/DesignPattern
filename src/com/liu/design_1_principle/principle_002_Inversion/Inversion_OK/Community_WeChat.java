package com.liu.design_1_principle.principle_002_Inversion.Inversion_OK;

import com.liu.design_1_principle.principle_002_Inversion.Inversion_OK.CommunityReceiver;

public class Community_WeChat implements CommunityReceiver {
    public String getInfo() {
        return "WeChat信息：hello world";
    }
}
