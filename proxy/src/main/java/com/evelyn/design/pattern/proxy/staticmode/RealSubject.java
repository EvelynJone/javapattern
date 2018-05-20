package com.evelyn.design.pattern.proxy.staticmode;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real request.");
    }
}
