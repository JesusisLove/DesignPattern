package com.liu.design_3_model.structure_07Proxy.type2_DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 这是代理工厂类
public class ProxyFactory {
    // 维护一个目标对象，Object，（让ProxyFactory解耦，使它不去依赖任何的业务类）
    private Object target;

    // 构造器，对target对象进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // ⭐️⭐️⭐️⭐️给目标对象生成一个动态代理对象的核心部分⭐️⭐️⭐️
    public Object getProxyInstance() {
        /*
        * 1. ClassLoader loader:指定当前目标对象使用的类加载器，获取加载器的方法是固定的
        * 2. Class<?>[] interfaces:目标对象实现的接口类型，使用泛型方式确认类型
        * 3. InvocationHandler handler：事件处理，执行目标对象的方法时，会触发事件处理器方法，会把当前执行的目标对象里的方法作为一个参数传入
        *
        * */
        // 返回一个代理对象
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),// loader参数
                target.getClass().getInterfaces(), // interfaces参数
                new InvocationHandler() {          // handler参数
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始。。。。");
                        Object obj = method.invoke(target,args);
                        System.out.println("JDK代理结束。。。。");
                        return obj;
                    }
                });
    }
}
