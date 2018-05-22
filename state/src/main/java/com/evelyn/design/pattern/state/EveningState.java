package com.evelyn.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月22日上午20:13]
 */
public class EveningState extends State {
    private static final Logger LOG = LoggerFactory.getLogger(EveningState.class);

    @Override
    public void writeProgram(Work w) {
        if (w.isTaskFinished()) {
            w.setState(new RestState());
            w.writeProgram();
        }else {
            if (w.getHour() < 21) {
                LOG.info("当前时间：{}点 加班，疲累。", w.getHour());
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
