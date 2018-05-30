package com.evelyn.design.pattern.flyweight;

import java.util.Hashtable;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月30日上午13:27]
 */
public class FlyweightFactory {

    private Hashtable<String ,Flyweight> flyweights = new Hashtable<>();

    public FlyweightFactory() {
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweights(String key) {
        return flyweights.get(key);
    }

}
