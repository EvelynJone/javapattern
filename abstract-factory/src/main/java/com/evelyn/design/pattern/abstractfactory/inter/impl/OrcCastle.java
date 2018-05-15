package com.evelyn.design.pattern.abstractfactory.inter.impl;

import com.evelyn.design.pattern.abstractfactory.inter.Castle;

/**
 * 功能说明：OrcKing
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:14]
 */
public class OrcCastle implements Castle {

    static final String DESCRIPTION = "This is the Orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
