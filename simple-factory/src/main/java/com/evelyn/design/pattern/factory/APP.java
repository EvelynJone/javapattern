package com.evelyn.design.pattern.factory;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class APP {
    public static void main(String[] args) {
        // 使用简单工厂模式
        LeiFeng student1 = SimpleFactory.createLeiFeng("学雷锋的大学生");
        student1.buyRice();

        LeiFeng student2 = SimpleFactory.createLeiFeng("学雷锋的大学生");
        student2.sweep();

        LeiFeng student3 = SimpleFactory.createLeiFeng("学雷锋的大学生");
        student3.wash();

        //使用工厂方法模式
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeifeng();
        student.wash();

    }
}
