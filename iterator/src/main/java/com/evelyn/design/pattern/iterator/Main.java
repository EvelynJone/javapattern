package com.evelyn.design.pattern.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月28日上午13:11]
 */
public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.setItems("Big bird");
        aggregate.setItems("litter");
        aggregate.setItems("li");
        aggregate.setItems("for");
        aggregate.setItems("bus");
        aggregate.setItems("stone");

        Iterator i = new ContreteIterator(aggregate);

        Object item = i.first();
        while (!i.isDone()) {
            LOG.info("{},please buy ticket.",i.currentItem());
            i.next();
        }

    }
}
