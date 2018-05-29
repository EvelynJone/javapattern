package com.evelyn.design.pattern.mediator;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
