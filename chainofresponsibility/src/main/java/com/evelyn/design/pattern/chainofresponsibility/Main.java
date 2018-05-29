package com.evelyn.design.pattern.chainofresponsibility;

/**
 * @auther zhaoxl
 * @date 2018/5/29.
 */
public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2,3,14,22,19,3,27,20};

        for (int request : requests) {
            h1.handleRequest(request);
        }

    }
}
