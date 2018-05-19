package com.evelyn.design.pattern.strategy.examples;

/**
 * DragonSlayer users different strategies to slay the dragon.
 * ：这是一个context类
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class DragonSlayer {

    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }
}
