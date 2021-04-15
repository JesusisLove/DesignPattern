package com.liu.design_3_model.behavior_11responsibilitychain;

import com.liu.design_3_model.behavior_10strategy.duck_nostrategy.AbstractDuck;
import com.liu.design_3_model.behavior_10strategy.duck_nostrategy.BeijingDuck;
import com.liu.design_3_model.behavior_10strategy.duck_nostrategy.ToyDuck;
import com.liu.design_3_model.behavior_10strategy.duck_nostrategy.WaterDuck;
import com.liu.design_3_model.behavior_11responsibilitychain.handler.*;
import com.liu.design_3_model.behavior_11responsibilitychain.request.PurchaseRequest;

public class Client {
    public static void main(String[] args) {

        // ①　采购单请求书
        PurchaseRequest request = new PurchaseRequest(18000);

         /*②
         * 上报审批者批复：因为职责链：系主任-->院长-->副校长-->校长-->系主任形成一个闭环，
         * 所以，找这四个人中的任何一个人审批，都可以找到能审批的责任者
         */
//        Approver approver = new DepartmentApprover("系主任");
//        Approver approver = new CollegeApprover("院长");
//        Approver approver = new ViceSchoolMasterApprover("副校长");
        Approver approver = new SchoolMasterApprover("校长");

        // ③　执行审批
        approver.processRequest(request);

    }
}
