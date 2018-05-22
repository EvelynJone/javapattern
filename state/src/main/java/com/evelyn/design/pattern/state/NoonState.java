package com.evelyn.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月22日上午20:11]
 */
public class NoonState extends State {

    private static final Logger LOG = LoggerFactory.getLogger(NoonState.class);

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            LOG.info("当前时间：{}点 ,饿了，午饭，犯困，午休。",w.getHour());
        }else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
