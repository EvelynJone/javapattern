package com.evelyn.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月22日上午20:14]
 */
public class SleepingState extends State {
    private static final Logger LOG = LoggerFactory.getLogger(SleepingState.class);

    @Override
    public void writeProgram(Work w) {
        LOG.info("当前时间：{}点，不行了，睡觉了",w.getHour());
    }
}
