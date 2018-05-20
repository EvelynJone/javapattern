package com.evelyn.design.pattern.prototype.examples;

import com.evelyn.design.pattern.prototype.examples.detail.*;
import com.evelyn.design.pattern.prototype.examples.detail.elf.ElfBeast;
import com.evelyn.design.pattern.prototype.examples.detail.elf.ElfMage;
import com.evelyn.design.pattern.prototype.examples.detail.elf.ElfWarlord;
import com.evelyn.design.pattern.prototype.examples.detail.orc.OrcBeast;
import com.evelyn.design.pattern.prototype.examples.detail.orc.OrcMage;
import com.evelyn.design.pattern.prototype.examples.detail.orc.OrcWarlord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws CloneNotSupportedException {
        HeroFactory factory ;
        Mage mage;
        Warlord warlord;
        Beast beast;

        factory =new HeroFactoryImpl(new ElfMage("cooking"),
                new ElfWarlord("cleaning"),
                new ElfBeast("protecting"));

        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();

        logger.info(mage.toString());
        logger.info(warlord.toString());
        logger.info(beast.toString());

        factory = new HeroFactoryImpl(new OrcMage("axe"),
                new OrcWarlord("swore"),
                new OrcBeast("laser"));

        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();

        logger.info(mage.toString());
        logger.info(warlord.toString());
        logger.info(beast.toString());
    }
}
