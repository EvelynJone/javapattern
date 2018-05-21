package com.evelyn.design.pattern.observers.evolution;

import java.util.function.Function;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:32]
 */
public class EventHandler {

    private Function function;

    public EventHandler(Function function) {
        this.function = function;
    }

    public void update() {
        function.apply(null);
    }

}
