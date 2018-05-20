package com.evelyn.design.pattern.prototype.examples.detail;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public abstract class Mage extends Prototype{

    @Override
    public abstract Mage copy() throws CloneNotSupportedException ;
}
