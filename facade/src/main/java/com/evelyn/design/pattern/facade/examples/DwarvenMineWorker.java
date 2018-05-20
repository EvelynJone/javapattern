package com.evelyn.design.pattern.facade.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public abstract class DwarvenMineWorker {

    private static final Logger logger = LoggerFactory.getLogger(DwarvenMineWorker.class);

    public void goToSleep() {
        logger.info("{} goes to sleep",name());
    }

    public void wakeUp() {
        logger.info("{} wakes up",name());
    }

    public void goHome() {
        logger.info("{} goes home.", name());
    }

    public void goToMine() {
        logger.info("{} goes to the mine.", name());
    }

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                logger.info("Undefined action");
                break;
        }
    }

    /**
     * Perform actions
     */
    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    public abstract void work();
    protected abstract String name();


    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}
