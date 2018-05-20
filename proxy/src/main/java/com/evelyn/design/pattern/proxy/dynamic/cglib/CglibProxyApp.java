package com.evelyn.design.pattern.proxy.dynamic.cglib;

/**
 * cglib 代理
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class CglibProxyApp {
    public static void main(String[] args) {

        UserDao target = new UserDao();
        UserDao proxy = (UserDao) new CglibProxyFactory(target).getProxyInstance();

        proxy.save();

    }
}
