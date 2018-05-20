package com.evelyn.design.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class CglibProxyFactory implements MethodInterceptor {
    
    private static final Logger logger = LoggerFactory.getLogger(CglibProxyFactory.class);
    
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //1.工具类
        Enhancer en = new Enhancer();

        //2.设置父类
        en.setSuperclass(target.getClass());

        //3.设置回调函数
        en.setCallback(this);

        //4.创建子类(代理对象)
        return en.create();
    }
    
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        logger.info("cglib proxy begin:");

        Object returnValue = method.invoke(target, args);

        logger.info("cglib proxy end.");
        return returnValue;
    }
}
