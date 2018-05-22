package com.evelyn.design.pattern.state;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月22日上午20:18]
 */
public class Main {
    public static void main(String[] args) {

        Work emergencyProjects = new Work();

        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(17);
        emergencyProjects.writeProgram();

        emergencyProjects.setTaskFinished(false);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(22);
        emergencyProjects.writeProgram();
    }
}
