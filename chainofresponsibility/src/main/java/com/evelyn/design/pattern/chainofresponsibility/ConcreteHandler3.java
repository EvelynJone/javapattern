package com.evelyn.design.pattern.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public class ConcreteHandler3 extends Handler {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteHandler3.class);

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            logger.info("{} handler request {}",this.getClass().getName(),request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
