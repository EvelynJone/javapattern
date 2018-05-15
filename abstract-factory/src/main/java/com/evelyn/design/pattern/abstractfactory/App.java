package com.evelyn.design.pattern.abstractfactory;

import com.evelyn.design.pattern.abstractfactory.factory.ElfKingdomFactory;
import com.evelyn.design.pattern.abstractfactory.factory.KingdomFactory;
import com.evelyn.design.pattern.abstractfactory.factory.OrcKingdomFactory;
import com.evelyn.design.pattern.abstractfactory.inter.Army;
import com.evelyn.design.pattern.abstractfactory.inter.Castle;
import com.evelyn.design.pattern.abstractfactory.inter.King;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:11]
 */
@Data
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        App app = new App();

        LOGGER.info("Elf Kingdom");

        app.createKingdom(new ElfKingdomFactory());
        LOGGER.info(app.getKing().getDescription());
        LOGGER.info(app.getCastle().getDescription());
        LOGGER.info(app.getArmy().getDescription());

        LOGGER.info("Orc Kingdom");

        app.createKingdom(new OrcKingdomFactory());
        LOGGER.info(app.getKing().getDescription());
        LOGGER.info(app.getCastle().getDescription());
        LOGGER.info(app.getArmy().getDescription());

    }

    private void createKingdom(KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    private King king;
    private Castle castle;
    private Army army;
}
