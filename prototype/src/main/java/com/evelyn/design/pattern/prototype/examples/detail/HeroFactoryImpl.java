package com.evelyn.design.pattern.prototype.examples.detail;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class HeroFactoryImpl implements HeroFactory {

    private Mage mage;
    private Warlord warlord;
    private Beast beast;

    public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
        this.mage = mage;
        this.warlord = warlord;
        this.beast = beast;
    }

    @Override
    public Mage createMage() throws CloneNotSupportedException {
        return mage.copy();
    }

    @Override
    public Warlord createWarlord() throws CloneNotSupportedException {
        return warlord.copy();
    }

    @Override
    public Beast createBeast() throws CloneNotSupportedException {
        return beast.copy();
    }
}
