package com.liu.design_3_model.behavior_11responsibilitychain.handler;

import com.liu.design_3_model.behavior_11responsibilitychain.request.PurchaseRequest;

public class SchoolMasterApprover extends Approver{
    // name 下一个处理者的名字
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println(purchaseRequest.getPrice() + " 这个金额，校长在审批!");
        } else {
              /*
             * 职责链：系主任-->院长-->副校长-->校长-->系主任，要形成一个闭环
             * 这样无论先找谁，都可以找到对应的审批者了
             * */
            nextApprover = new DepartmentApprover("系主任");
            nextApprover.processRequest(purchaseRequest);
        }
    }
}