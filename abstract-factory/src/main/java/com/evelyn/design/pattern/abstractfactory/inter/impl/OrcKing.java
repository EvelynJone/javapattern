package com.evelyn.design.pattern.abstractfactory.inter.impl;

import com.evelyn.design.pattern.abstractfactory.inter.King;

/**
 * 功能说明：OrcKing ： 兽人国王
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:14]
 */
public class OrcKing implements King {

    static final String DESCRIPTION = "This is the Orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
