package com.liu.design_3_model.behavior_11responsibilitychain.handler;

import com.liu.design_3_model.behavior_11responsibilitychain.request.PurchaseRequest;

public class DepartmentApprover extends Approver{
    // name 下一个处理者的名字
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 5000.0) {
            System.out.println(purchaseRequest.getPrice() + " 这个金额，我系主任就可以审批了!");
        } else if(purchaseRequest.getPrice() > 5000.0) {
            System.out.println(purchaseRequest.getPrice() + " 这个金额，太多了，系主任我审批不了!，现在上报给院长审批。。。");
             /*
             * 职责链：系主任-->院长-->副校长-->校长-->系主任，要形成一个闭环
             * 这样无论先找谁，都可以找到对应的审批者了
             * */
            nextApprover = new CollegeApprover("院长");
            nextApprover.processRequest(purchaseRequest);
        } else {
            nextApprover = new DepartmentApprover("系主任");
            nextApprover.processRequest(purchaseRequest);
        }

    }
}