package com.evelyn.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月22日上午20:12]
 */
public class AfternoonState extends State {
    private static final Logger LOG = LoggerFactory.getLogger(AfternoonState.class);

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17) {
            LOG.info("当前时间：{}点 下午状态还不错，继续努力",w.getHour());
        }else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
