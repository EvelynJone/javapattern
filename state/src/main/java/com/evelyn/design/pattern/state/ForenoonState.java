package com.evelyn.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月22日上午20:00]
 */
public class ForenoonState extends State {

    private static final Logger LOG = LoggerFactory.getLogger(ForenoonState.class);


    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12) {
            LOG.info("当前时间：{}点 上午工作",w.getHour());
        }else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
