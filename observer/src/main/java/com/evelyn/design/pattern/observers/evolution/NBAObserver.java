package com.evelyn.design.pattern.observers.evolution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:28]
 */
public class NBAObserver {
    private static final Logger LOG = LoggerFactory.getLogger(NBAObserver.class);
    protected String name;
    protected Subject sub;

    public NBAObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeNBADirectSeeding() {
        LOG.info("{} {} 关闭NBA直播，继续工作",sub.getState(),name);
    }
}
