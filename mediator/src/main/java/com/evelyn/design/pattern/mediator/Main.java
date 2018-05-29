package com.evelyn.design.pattern.mediator;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("eat?");
        c2.send("no");
    }
}
