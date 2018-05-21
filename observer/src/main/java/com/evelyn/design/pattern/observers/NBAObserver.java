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
public class NBAObserver extends Observer {

    private static final Logger LOG = LoggerFactory.getLogger(NBAObserver.class);

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        LOG.info("{} {} 关闭NBA直播，继续工作",sub.secretaryAction(),name);
    }
}
