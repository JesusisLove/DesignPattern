package com.liu.design_3_model.structure_02Bridge;

public abstract class AbsPhone {
    // 聚合品牌接口
    private IBrand brand;
    // 构造器
    public AbsPhone (IBrand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void shutDown() {
        this.brand.shutdown();
    }

    protected void call() {
        this.brand.call();
    }

}
