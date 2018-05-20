package com.evelyn.design.pattern.prototype;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public abstract class Prototype {

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract Prototype clone();

}
