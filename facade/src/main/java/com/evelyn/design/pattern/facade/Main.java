package com.evelyn.design.pattern.facade;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
