package com.evelyn.design.pattern.observers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:00]
 */
public class StockObserver extends Observer {

    private static final Logger LOG = LoggerFactory.getLogger(StockObserver.class);

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        LOG.info("{} {} 关闭股票行情，继续工作",sub.secretaryAction(),name);
    }
}
