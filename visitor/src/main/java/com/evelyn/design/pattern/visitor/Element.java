package com.evelyn.design.pattern.visitor;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年06月04日上午18:57]
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);

}
