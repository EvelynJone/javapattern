package com.evelyn.design.pattern.abstractfactory.inter.impl;

import com.evelyn.design.pattern.abstractfactory.inter.Army;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月15日上午20:16]
 */
public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
