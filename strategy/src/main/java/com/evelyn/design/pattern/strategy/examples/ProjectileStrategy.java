package com.evelyn.design.pattern.strategy.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略的实现类：Projectile--抛出去（摔死）
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class ProjectileStrategy implements DragonSlayingStrategy {

    private static final Logger logger = LoggerFactory.getLogger(ProjectileStrategy.class);

    @Override
    public void execute() {
        logger.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
