package com.liu.design_3_model.structure_04Composite;

import java.util.ArrayList;
import java.util.List;

// College 也是 Composite，可以去管理Department
public class Component2_College extends AbsOrganization {

    // College类里，聚合了AbsOrganizationComponent
    // List里面存放的是Department类到实例对象
    List<AbsOrganization> organizationComponentList = new ArrayList<AbsOrganization>();

    // 构造器
    public Component2_College(String name, String descript) {
        // 通过父类去完成构造
        super(name, descript);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescript() {
        return super.getDescript();
    }

    // 重写add方法（因为学院里要添加系）
    @Override
    protected void add(AbsOrganization organizationComponent) {
        // 添加College的业务逻辑 在实际开发中，不同的Component会有不同的业务逻辑，这里只是一个简单的演示
        organizationComponentList.add(organizationComponent);
    }

    // 重写remove方法（因为学院里要撤掉系）
    @Override
    protected void remove(AbsOrganization organizationComponent) {
        // 添加College的业务逻辑 在实际开发中，不同的Component会有不同的业务逻辑，这里只是一个简单的演示
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("---------------" + getName() + "---------------" );
        for (AbsOrganization organizationComponent:organizationComponentList) {
            organizationComponent.print();
        }
    }
}
