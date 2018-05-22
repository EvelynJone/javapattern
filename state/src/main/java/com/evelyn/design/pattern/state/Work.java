package com.evelyn.design.pattern.state;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月22日上午19:51]
 */
public class Work {

    private int hour;
    private boolean finish = false;

    private boolean taskFinished;

    public Work() {
        current = new ForenoonState();
    }

    private State current;

    public State getState() {
        return current;
    }

    public void setState(State state) {
        this.current = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }

    public void writeProgram() {
       this.current.writeProgram(this);
    }
}
