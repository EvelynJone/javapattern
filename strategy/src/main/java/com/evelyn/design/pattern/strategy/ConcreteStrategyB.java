package com.evelyn.design.pattern.strategy;

/**
 * 具体策略类，封装了具体的算法或行为
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("concrete strategy B");
    }
}
