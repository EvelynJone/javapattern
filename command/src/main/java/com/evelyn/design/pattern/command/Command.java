package com.evelyn.design.pattern.command;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
