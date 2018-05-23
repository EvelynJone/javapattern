package com.evelyn.design.pattern.memento;

/**
 * 功能说明：发起人
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月23日上午19:32]
 */
public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("state : " + state);
    }
}
