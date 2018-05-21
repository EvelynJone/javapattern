package com.evelyn.design.pattern.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：动物-基类
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月17日上午13:41]
 */
public abstract class Animal {

    private static final Logger LOG = LoggerFactory.getLogger(Animal.class);

    /**
     * 有生命
     */
    private boolean live;


    /**
     * 新陈代谢
     * @param oxygen
     * @param water
     */
    public void metabolism(Oxygen oxygen,Water water) {
        LOG.info("oxygen:{}",oxygen);
        LOG.info("water:{}",water);
    }

    /**
     * 繁殖
     * @return
     */
    public Animal sire() {
        throw new UnsupportedOperationException("parent has not live");
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
