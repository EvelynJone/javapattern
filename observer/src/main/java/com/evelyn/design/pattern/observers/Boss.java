package com.evelyn.design.pattern.observers;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：前台秘书类
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:00]
 */
public class Boss extends Subject{

    private List<Observer> observers = new ArrayList<>();
    private String action;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public String secretaryAction(){
        return action;
    }
}
