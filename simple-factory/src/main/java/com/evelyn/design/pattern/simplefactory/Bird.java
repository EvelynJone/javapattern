package com.evelyn.design.pattern.simplefactory;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月17日上午13:43]
 */
public class Bird extends Animal {

    private Wing wing;

    public Bird() {
        // 初始化时，实例化Wing，同时生成
        wing = new Wing();
    }

}
