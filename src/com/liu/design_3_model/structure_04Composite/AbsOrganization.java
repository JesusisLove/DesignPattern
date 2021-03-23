package com.liu.design_3_model.structure_04Composite;

public abstract class AbsOrganization {
    private String name;
    private String descript;

    // 构造器
    public AbsOrganization(String name, String descript) {
        this.name = name;
        this.descript = descript;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    protected void add(AbsOrganization organizationComponent) {
        /* 问：为什么将这里的默认实现作为空的方法，不写代码（不看抛异常的处理）？
        *  答：叶子类（Leaf）和非叶子类（Component）都继承了Organization抽象类，
        *     从组合模式看，Department是College的孩子节点，而College是University的子节点
        *     Department是叶子类，因为叶子类没有孩子节点，就谈不上叶子类要处理它的孩子节点，所以不用做处理，
        *     只有Component需要做处理，所以，在Component的类里重写add方法，实现其具体的业务逻辑
        *     如果在这里写代码，因为叶子类用不上，所以避免了代码的冗余。
        * */

        // 抛一个不能识别支持的异常
        throw new UnsupportedOperationException();
    }

    protected void remove(AbsOrganization organizationComponent) {
        // 默认实现

        // 抛一个不能识别支持的异常
        throw new UnsupportedOperationException();
    }

    // 打印
    public abstract void print();
}
