package com.evelyn.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月28日上午13:06]
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ContreteIterator(this);
    }

    public int getCount(){
        return this.items.size();
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(Object item) {
        this.items.add(item);
    }
}
