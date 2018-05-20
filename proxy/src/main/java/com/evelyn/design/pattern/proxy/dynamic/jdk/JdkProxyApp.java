package com.evelyn.design.pattern.proxy.dynamic.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用jdk 动态代理
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class JdkProxyApp {
    private static final Logger logger = LoggerFactory.getLogger(JdkProxyApp.class);

    public static void main(String[] args) {
        IUserDao target = new UserDao();

        logger.info("real class : {}",target.getClass());

        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();

        logger.info("proxy class: {}",proxy.getClass());

        proxy.save();
    }
}
