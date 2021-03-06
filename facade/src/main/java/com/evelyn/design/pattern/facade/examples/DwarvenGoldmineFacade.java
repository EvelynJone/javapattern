package com.evelyn.design.pattern.facade.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class DwarvenGoldmineFacade {

    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade() {
        workers = new ArrayList<>();

        workers.add(new DwarvenCartOperator());
        workers.add(new DwarvenGoldDigger());
        workers.add(new DwarvenTunnelDigger());
    }

    public void startNewDay() {
        makeActions(workers,DwarvenMineWorker.Action.WAKE_UP,
                DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

    private void makeActions(List<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
        for (DwarvenMineWorker worker : workers) {
            worker.action(actions);
        }
    }
}
