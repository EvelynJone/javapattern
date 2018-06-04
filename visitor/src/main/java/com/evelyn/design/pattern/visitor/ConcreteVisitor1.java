package com.evelyn.design.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年06月04日上午18:56]
 */
public class ConcreteVisitor1 extends Visitor {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteVisitor1.class);

    @Override
    public void visitCincreteElementA(ConcreteElementA concreteElementA) {
        LOG.info("{}被{}访问",concreteElementA);
    }

    @Override
    public void visitCincreteElementB(ConcreteElementB concreteElementB) {
        LOG.info("{}被{}访问",concreteElementB);
    }
}
