package com.evelyn.design.pattern.bridge;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月29日上午13:04]
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operator() {
        implementor.operation();
    }
}
