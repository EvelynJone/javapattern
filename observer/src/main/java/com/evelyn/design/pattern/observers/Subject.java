package com.evelyn.design.pattern.observers;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:12]
 */
public abstract class Subject {

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notifyObserver();

    public abstract String secretaryAction();
}
