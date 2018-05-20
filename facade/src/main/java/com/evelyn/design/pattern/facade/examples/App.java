package com.evelyn.design.pattern.facade.examples;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class App {
    public static void main(String[] args) {

        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();

        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();

    }
}
