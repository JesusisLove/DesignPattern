package com.liu.design_3_model.structure_04Composite;

import java.util.ArrayList;
import java.util.List;

// College 也是 Composite，可以去管理Department
public class Leaf_Department extends AbsOrganization {

    // University类里，聚合了AbsOrganizationComponent
    // List里面存放的是Department
    List<AbsOrganization> organizationComponentList = new ArrayList<AbsOrganization>();

    // 构造器
    public Leaf_Department(String name, String descript) {
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

    // 🔸🔸🔸🔸🔸🔸🔸不要重写add方法和remove方法了，为什么？因为Department已经是叶子节点了，它的节点下面没有什么可管理的了。🔸🔸🔸🔸🔸🔸🔸


    @Override
    public void print() {
        System.out.println(getName());
        for (AbsOrganization organizationComponent:organizationComponentList) {
            organizationComponent.print();
        }

    }
}
