package com.evelyn.design.pattern.prototype;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return this.memberwiseClone();
    }

    private Prototype memberwiseClone() {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1(this.getId());
        return concretePrototype1;
    }
}
