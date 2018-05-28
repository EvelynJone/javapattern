package com.evelyn.design.pattern.iterator;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月28日上午13:06]
 */
public class ContreteIterator extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ContreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItems().get(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current ++;
        if (current < aggregate.getCount()) {
            ret = aggregate.getItems().get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems().get(current);
    }
}
