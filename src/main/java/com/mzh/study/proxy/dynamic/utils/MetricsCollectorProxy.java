package com.mzh.study.proxy.dynamic.utils;

import com.mzh.study.proxy.dynamic.controller.IUserController;
import com.mzh.study.proxy.dynamic.controller.UserController;
import com.mzh.study.proxy.dynamic.domain.RegisterInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by mazhihui on 2020/3/1.
 */
public class MetricsCollectorProxy {
    private MetricsCollector metricsCollector;
    public MetricsCollectorProxy(MetricsCollector metricsCollector){
        this.metricsCollector = metricsCollector;
    }
    public Object createProxy(Object proxiedObj){
        Class[] interfaces = proxiedObj.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObj);
        return Proxy.newProxyInstance(proxiedObj.getClass().getClassLoader(),interfaces,handler);
    }
    private class DynamicProxyHandler implements InvocationHandler{
        private Object proxiedObj;
        public DynamicProxyHandler(Object proxiedObj){
            this.proxiedObj = proxiedObj;
        }
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long starttimestamp = System.currentTimeMillis();
            Object result = method.invoke(proxiedObj,args);
            long endtimestamp = System.currentTimeMillis();
            String apiname = proxiedObj.getClass().getName()+"."+method.getName();
            RegisterInfo registerInfo = new RegisterInfo(apiname,starttimestamp,endtimestamp);
            metricsCollector.register(registerInfo);
            return result;
        }
    }

    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy(new MetricsCollector());
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        System.out.println(userController.login());
    }
}
