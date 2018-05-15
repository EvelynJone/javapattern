package com.evelyn.design.pattern.abstractfactory.factory;

import com.evelyn.design.pattern.abstractfactory.inter.Army;
import com.evelyn.design.pattern.abstractfactory.inter.Castle;
import com.evelyn.design.pattern.abstractfactory.inter.King;
import com.evelyn.design.pattern.abstractfactory.inter.impl.ElfArmy;
import com.evelyn.design.pattern.abstractfactory.inter.impl.ElfCastle;
import com.evelyn.design.pattern.abstractfactory.inter.impl.ElfKing;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:21]
 */
public class ElfKingdomFactory implements KingdomFactory{

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
