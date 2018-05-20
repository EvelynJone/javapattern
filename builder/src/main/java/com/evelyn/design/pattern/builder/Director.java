package com.evelyn.design.pattern.builder;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
