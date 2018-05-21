package com.evelyn.design.pattern.observers;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午18:59]
 */
public abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();

}
