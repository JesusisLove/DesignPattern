package com.liu.design_3_model.behavior_11responsibilitychain.handler;

import com.liu.design_3_model.behavior_11responsibilitychain.request.PurchaseRequest;

public class CollegeApprover extends Approver{
    // name 下一个处理者的名字
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000.0) {
            System.out.println(purchaseRequest.getPrice() + " 这个金额，我院长就可以审批了!");
        } else if (purchaseRequest.getPrice() > 10000) {
            System.out.println(purchaseRequest.getPrice() + " 这个金额，太多了，院长我审批不了!，现在上报给副校长审批。。。");
             /*
             * 职责链：系主任-->院长-->副校长-->校长-->系主任，要形成一个闭环
             * 这样无论先找谁，都可以找到对应的审批者了
             * */
            nextApprover = new ViceSchoolMasterApprover("副校长");
            nextApprover.processRequest(purchaseRequest);
        } else {
            nextApprover = new DepartmentApprover("系主任");
            nextApprover.processRequest(purchaseRequest);
        }

    }
}