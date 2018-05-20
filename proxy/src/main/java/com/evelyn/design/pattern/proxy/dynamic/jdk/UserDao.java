package com.evelyn.design.pattern.proxy.dynamic.jdk;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("save user dao");
    }
}
