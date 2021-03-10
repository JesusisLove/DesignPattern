package com.liu.design_1_principle.principle_002_Inversion.Inversion_OK;

import com.liu.design_1_principle.principle_002_Inversion.Inversion_OK.CommunityReceiver;

public class Community_whatsApp implements CommunityReceiver {
    public String getInfo() {
        return "whatsApp信息：hello world";
    }
}
