package com.liu.design_3_model.structure_07Proxy.type1_staticProxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 创建代理对象，同时将目标对象传递给代理对象
        TeacherDaoProxy proxyDao = new TeacherDaoProxy(teacherDao);
        // 通过代理对象，调用目标对象的方法
        proxyDao.teach();
    }
}
