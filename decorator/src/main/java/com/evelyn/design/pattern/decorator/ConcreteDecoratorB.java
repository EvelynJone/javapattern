package com.evelyn.design.pattern.decorator;

/**
 * 装饰B
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        AddedBehavior();
        System.out.println("具体装饰类对象B的操作");
    }

    /**
     * 本类独有的方法，以区别于其他
     */
    private void AddedBehavior() {
        System.out.println("concrete decorator B add behavior");
    }

}
