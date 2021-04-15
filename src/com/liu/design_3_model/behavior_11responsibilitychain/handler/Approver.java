package com.liu.design_3_model.behavior_11responsibilitychain.handler;

import com.liu.design_3_model.behavior_11responsibilitychain.request.PurchaseRequest;

public abstract class Approver {

    Approver nextApprover;// 当前处理者的下一个处理者
    String name; // 当前处理者的名字

    // 构造器
    public Approver(String name) {
        this.name = name;
    }

    // 自己处理不了的情况下，就交给下一个处理者来处理
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    // 处理审批请求的方法。该方法是抽象方法，具体方法在各个子类中实现
    public abstract void processRequest(PurchaseRequest purchaseRequest);


}
