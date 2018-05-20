package com.evelyn.design.pattern.decorator;

/**
 * 装饰A
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class ConcreteDecoratorA extends Decorator {

    /** 本类独有功能，以区别于ConcreteDecoratorB*/
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰类对象A的操作：" + addedState);
    }

}
