package com.evelyn.design.pattern.factory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}
