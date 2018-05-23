package com.evelyn.design.pattern.adapter;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月23日上午19:18]
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();

        target.request();
    }
}
