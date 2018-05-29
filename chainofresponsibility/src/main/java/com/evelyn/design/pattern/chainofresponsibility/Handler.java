package com.evelyn.design.pattern.chainofresponsibility;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
