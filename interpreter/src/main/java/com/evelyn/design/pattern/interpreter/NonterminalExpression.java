package com.evelyn.design.pattern.interpreter;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月31日上午13:46]
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {

        System.out.println("nonterminal expression:"+context.getInput());
        context.setOutput("nonterminal expression");
    }
}
