package com.evelyn.design.pattern.facade.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class DwarvenCartOperator extends DwarvenMineWorker {

    private static final Logger logger = LoggerFactory.getLogger(DwarvenCartOperator.class);

    @Override
    public void work() {
        logger.info("{} moves gold chunks out of the mine.",name());
    }

    @Override
    protected String name() {
        return "Dwarf cart operator";
    }
}
