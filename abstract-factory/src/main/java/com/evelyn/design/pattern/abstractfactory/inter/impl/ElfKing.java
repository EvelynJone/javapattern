package com.evelyn.design.pattern.abstractfactory.inter.impl;

import com.evelyn.design.pattern.abstractfactory.inter.King;

/**
 * 功能说明：ElfKing ： 精灵国王
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:13]
 */
public class ElfKing implements King {

    static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
