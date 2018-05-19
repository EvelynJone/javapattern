package com.evelyn.design.pattern.strategy.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 主类
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // GoF Strategy pattern
        logger.info("Green dragon spotted ahead!");
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        logger.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        logger.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        // Java 8 Strategy pattern
        logger.info("Green dragon spotted ahead!");
        dragonSlayer = new DragonSlayer(
                ()->logger.info("With your Excalibur you severe the dragon's head"));
        dragonSlayer.goToBattle();

        logger.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(
                ()->logger.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
        dragonSlayer.goToBattle();

        logger.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(
                ()->logger.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        dragonSlayer.goToBattle();
    }
}
