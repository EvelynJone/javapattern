package com.evelyn.design.pattern.facade.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {

    private static final Logger logger = LoggerFactory.getLogger(DwarvenTunnelDigger.class);

    @Override
    public void work() {
        logger.info("{} creates another promising tunnel.",name());
    }

    @Override
    protected String name() {
        return "Dwarven tunnel digger";
    }
}
