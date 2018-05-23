package com.evelyn.design.pattern.memento.examples;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月23日上午19:44]
 */
public class Main {
    public static void main(String[] args) {
        // before
        GameRole littor = new GameRole();
        littor.getInitState();
        littor.stateDisplay();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(littor.saveState());

        littor.fight();
        littor.stateDisplay();

        littor.recoveryState(caretaker.getMemento());
        littor.stateDisplay();
    }
}
