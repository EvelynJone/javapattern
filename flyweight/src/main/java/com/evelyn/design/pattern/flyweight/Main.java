package com.evelyn.design.pattern.flyweight;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月30日上午13:29]
 */
public class Main {
    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweights("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = f.getFlyweights("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = f.getFlyweights("Z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyWeight uf = new UnsharedConcreteFlyWeight();
        uf.operation(--extrinsicstate);

    }
}
