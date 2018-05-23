package com.evelyn.design.pattern.memento;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月23日上午19:34]
 */
public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
