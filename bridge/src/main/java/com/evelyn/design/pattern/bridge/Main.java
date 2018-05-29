package com.evelyn.design.pattern.bridge;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月29日上午13:04]
 */
public class Main {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operator();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operator();

    }
}
