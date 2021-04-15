package com.liu.design_3_model.behavior_11responsibilitychain.request;

public class PurchaseRequest {
    private float price = 0.0f;

    // 构造器
    public PurchaseRequest(float price) {
        // 请求的金额
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
