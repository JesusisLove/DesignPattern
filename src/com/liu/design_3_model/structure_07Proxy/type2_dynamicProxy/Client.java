package com.liu.design_3_model.structure_07Proxy.type2_dynamicProxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        ITeacherDao target = new TeacherDao();

        // 创建代理对象工厂，同时将目标对象传递给代理对象
        ProxyFactory proxyFactory = new ProxyFactory(target);

        // 通过JDK的返回机制，返回一个动态的代理对象
        ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
        // 执行结果：proxyInstance.getClass() = class com.sun.proxy.$Proxy0看到$，就表示返回的是一个代理对象。
        System.out.println("proxyInstance.getClass() = " + proxyInstance.getClass());
        // 执行结果：proxyInstance = com.liu.design_3_model.structure_07Proxy.type2_DynamicProxy.TeacherDao@66d3c617
        System.out.println("proxyInstance = " + proxyInstance);

        // 通过返回的代理对象，调用目标对象的方法
        float attendanceRate = proxyInstance.studentCheckIn("Ni");// 此处动态代理对象调用了一次目标类的方法了
        System.out.println("attendanceRate = " + attendanceRate);

        // 如果这个班级这节课的出勤率是80%，老师就可以上课
        if (attendanceRate > 0.8f) {
            proxyInstance.teach();// 此处动态代理对象调用了一次目标类的方法了
        }
    }
}
