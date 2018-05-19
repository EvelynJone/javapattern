package com.evelyn.design.pattern.strategy.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略的实现类：Spell -- 拼写（咒语）
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class SpellStrategy implements DragonSlayingStrategy {
    private static final Logger logger = LoggerFactory.getLogger(SpellStrategy.class);

    @Override
    public void execute() {
        logger.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust! ");
    }
}
