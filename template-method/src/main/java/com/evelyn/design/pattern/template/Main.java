package com.evelyn.design.pattern.template;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass c;

        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();

    }
}
