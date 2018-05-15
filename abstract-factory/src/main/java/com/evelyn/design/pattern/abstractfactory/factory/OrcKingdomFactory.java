package com.evelyn.design.pattern.abstractfactory.factory;

import com.evelyn.design.pattern.abstractfactory.inter.Army;
import com.evelyn.design.pattern.abstractfactory.inter.Castle;
import com.evelyn.design.pattern.abstractfactory.inter.King;
import com.evelyn.design.pattern.abstractfactory.inter.impl.OrcArmy;
import com.evelyn.design.pattern.abstractfactory.inter.impl.OrcCastle;
import com.evelyn.design.pattern.abstractfactory.inter.impl.OrcKing;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:20]
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
