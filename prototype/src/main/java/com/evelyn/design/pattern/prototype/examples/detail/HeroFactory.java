package com.evelyn.design.pattern.prototype.examples.detail;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public interface HeroFactory {

    Mage createMage() throws CloneNotSupportedException;

    Warlord createWarlord() throws CloneNotSupportedException;

    Beast createBeast() throws CloneNotSupportedException;

}
