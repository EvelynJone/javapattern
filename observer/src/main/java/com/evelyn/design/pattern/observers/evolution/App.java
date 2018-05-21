package com.evelyn.design.pattern.observers.evolution;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午20:29]
 */
public class App {
    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver tongshi1 = new StockObserver("xxx",boss);
        NBAObserver tongshi2 = new NBAObserver("yyy",boss);


        // 失败
    }
}
