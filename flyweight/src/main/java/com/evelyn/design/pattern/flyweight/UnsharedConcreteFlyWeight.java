package com.evelyn.design.pattern.flyweight;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月30日上午13:26]
 */
public class UnsharedConcreteFlyWeight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("unshared concrete flyweight: " + extrinsicstate);
    }
}
