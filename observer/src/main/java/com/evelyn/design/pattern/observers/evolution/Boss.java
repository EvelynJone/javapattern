package com.evelyn.design.pattern.observers.evolution;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:33]
 */
public class Boss implements Subject {

    public EventHandler update;

    @Override
    public void notifyObserver() {
        update.update();
    }

    @Override
    public String getState() {
        return null;
    }
}
