package com.evelyn.design.pattern.strategy.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略的实现类：Melee--乱斗
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class MeleeStrategy implements DragonSlayingStrategy {
    private static final Logger logger = LoggerFactory.getLogger(MeleeStrategy.class);

    @Override
    public void execute() {
        logger.info("With your Excalibur you sever the dragon's head!");
    }
}
