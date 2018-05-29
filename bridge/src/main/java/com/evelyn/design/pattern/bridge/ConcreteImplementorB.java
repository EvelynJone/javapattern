package com.evelyn.design.pattern.bridge;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月29日上午13:02]
 */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("concrete Implementor B opetarion");
    }
}
