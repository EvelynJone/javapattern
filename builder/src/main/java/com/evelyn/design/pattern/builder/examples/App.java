package com.evelyn.design.pattern.builder.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        Character warrior = CharacterStepBuilder.newBuilder()
                .name("Amberjill")
                .fighterClass("Paladin")
                .withWeapon("Sword")
                .noAbilities().build();

        logger.info(warrior.toString());
    }
}
