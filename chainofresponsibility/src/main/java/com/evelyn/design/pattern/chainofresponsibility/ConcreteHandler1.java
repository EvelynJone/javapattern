package com.evelyn.design.pattern.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public class ConcreteHandler1 extends Handler {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteHandler1.class);

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            logger.info("{} handler request {}",this.getClass().getName(),request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
