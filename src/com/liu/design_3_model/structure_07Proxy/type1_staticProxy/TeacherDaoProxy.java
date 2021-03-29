package com.liu.design_3_model.structure_07Proxy.type1_staticProxy;

// 这是静态代理类
public class TeacherDaoProxy implements ITeacherDao {
    // 目标对象，通过接口来聚合
    private ITeacherDao target;

    // 构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理使用开始。。。");
        target.teach();
        System.out.println("代理使用结束。。。");
    }
}
