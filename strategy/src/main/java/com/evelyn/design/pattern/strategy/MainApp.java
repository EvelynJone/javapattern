package com.evelyn.design.pattern.strategy;

/**
 * 实例化不同的策略，所以最终在调用的时候，所获得的的结果就不尽相同
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class MainApp {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
    }
}
