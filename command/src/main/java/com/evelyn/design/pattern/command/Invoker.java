package com.evelyn.design.pattern.command;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
