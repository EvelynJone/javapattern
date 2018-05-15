package com.evelyn.design.pattern.abstractfactory.factory;

import com.evelyn.design.pattern.abstractfactory.inter.Army;
import com.evelyn.design.pattern.abstractfactory.inter.Castle;
import com.evelyn.design.pattern.abstractfactory.inter.King;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:14]
 */
public interface KingdomFactory {

    King createKing();

    Castle createCastle();

    Army createArmy();
}

