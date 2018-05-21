package com.evelyn.design.pattern.observers.evolution;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:31]
 */
public interface Subject {
    void notifyObserver();
    String getState();
}
