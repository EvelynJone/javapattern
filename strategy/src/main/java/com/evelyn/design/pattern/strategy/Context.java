package com.evelyn.design.pattern.strategy;

/**
 * context上下文，用一个ConcreteStrategy 来配置，维护一个队strategy对象的引用
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.algorithmInterface();
    }
}
