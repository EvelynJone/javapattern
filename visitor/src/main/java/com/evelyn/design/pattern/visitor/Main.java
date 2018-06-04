package com.evelyn.design.pattern.visitor;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年06月04日上午19:03]
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();

        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();

        o.accept(visitor1);

    }
}
