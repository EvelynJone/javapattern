package com.evelyn.design.pattern.mediator;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message) {
        System.out.println("colleague2 has message");
    }
}
