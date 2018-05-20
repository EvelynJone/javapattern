package com.evelyn.design.pattern.facade.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {
    private static final Logger logger = LoggerFactory.getLogger(DwarvenGoldDigger.class);

    @Override
    public void work() {
        logger.info("{} digs for gold",name());
    }

    @Override
    protected String name() {
        return "Dwarf gold digger";
    }
}
