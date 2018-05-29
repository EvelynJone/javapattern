package com.evelyn.design.pattern.command;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
