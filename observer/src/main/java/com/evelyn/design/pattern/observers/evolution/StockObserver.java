package com.evelyn.design.pattern.observers.evolution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:29]
 */
public class StockObserver {
    private static final Logger LOG = LoggerFactory.getLogger(StockObserver.class);
    protected String name;
    protected Subject sub;

    public StockObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeStockMarket() {
        LOG.info("{} {} 关闭股票行情，继续工作",sub.getState(),name);
    }
}
