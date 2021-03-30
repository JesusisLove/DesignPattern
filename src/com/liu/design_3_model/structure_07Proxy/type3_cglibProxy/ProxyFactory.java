package com.liu.design_3_model.structure_07Proxy.type3_cglibProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回一个代理对象：这个对象是目标对象target的代理对象
    public Object getProxyInstance() {

        /* ------- 1。2。3。4步，这是Cglib代理框架的固定写法 返回一个代理对象 开始 ------- */
        // 1。创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2。设置父类
        enhancer.setSuperclass(target.getClass());
        // 3。设置回调函数
        enhancer.setCallback(this);
        // 4。创建子类对象，即代理对象
        return enhancer.create();
        /* ------- 1。2。3。4步，这是Cglib代理框架的固定写法 返回一个代理对象 结束 ------- */

    }

    // 重写intercept()拦截方法，在这个方法里面回调用目标对象的相关方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始～～～～～～～");
        Object proxyObj = method.invoke(target,objects);
        System.out.println("Cglib代理模式结束～～～～～～～");
        return proxyObj;
    }
}
