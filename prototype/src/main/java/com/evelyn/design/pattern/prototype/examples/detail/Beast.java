package com.evelyn.design.pattern.prototype.examples.detail;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public abstract class Beast extends Prototype{

    @Override
    public abstract Beast copy() throws CloneNotSupportedException;
}
