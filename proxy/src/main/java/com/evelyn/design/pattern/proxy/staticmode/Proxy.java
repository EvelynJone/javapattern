package com.evelyn.design.pattern.proxy.staticmode;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class Proxy implements Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        realSubject.request();
    }
}
