package com.evelyn.design.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月31日上午13:49]
 */
public class Main {
    public static void main(String[] args) {
        Context context= new Context();
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new NonterminalExpression());
        expressions.add(new TerminalExpression());


        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }


    }

}
