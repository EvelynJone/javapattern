package com.evelyn.design.pattern.observers;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月21日上午19:14]
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver tongshi1 = new StockObserver("xxx",boss);
        NBAObserver tongshi2 = new NBAObserver("yyy",boss);

        boss.attach(tongshi1);
        boss.attach(tongshi2);

        boss.detach(tongshi1);

        boss.setAction("I come back");

        boss.notifyObserver();
    }
}
