package com.liu.design_3_model.structure_04Composite;

import java.util.ArrayList;
import java.util.List;

// University 就是 Composite，可以去管理College
public class Component1_University extends AbsOrganization {

    // University类里，聚合了AbsOrganizationComponent
    // List里面存放的是College类到实例对象
    List<AbsOrganization> organizationComponentList = new ArrayList<AbsOrganization>();

    // 构造器
    public Component1_University(String name, String descript) {
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

    // 重写add方法（因为大学里要增加学院）
    @Override
    protected void add(AbsOrganization organizationComponent) {
        // 添加College的业务逻辑 在实际开发中，不同的Component会有不同的业务逻辑，这里只是一个简单的演示
        organizationComponentList.add(organizationComponent);
    }

    // 重写remove方法（因为大学里要撤销学院）
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
