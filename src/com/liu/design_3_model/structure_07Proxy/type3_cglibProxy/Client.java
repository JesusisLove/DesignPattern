package com.liu.design_3_model.structure_07Proxy.type3_cglibProxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao target = new TeacherDao();

        // 创建代理对象工厂，同时将目标对象传递给代理对象
        ProxyFactory proxyFactory = new ProxyFactory(target);

        // 通过Cglib的回调机制，为TeacherDao类对象，返回一个动态的代理对象，这个代理对象proxyInstance去调用目标对象的方法。
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();

        // 通过返回的代理对象，调用目标对象的方法
        float attendanceRate = proxyInstance.studentCheckIn("Ni");// 此处动态代理对象调用了一次目标类的方法了
        System.out.println("attendanceRate = " + attendanceRate);

        // 如果这个班级这节课的出勤率是80%，老师就可以上课
        if (attendanceRate > 0.8f) {
            proxyInstance.teach();// 此处动态代理对象调用了一次目标类的方法了
        }
    }
}
