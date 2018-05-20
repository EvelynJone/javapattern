package com.evelyn.design.pattern.builder;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();

    public abstract Product getResult();
}
