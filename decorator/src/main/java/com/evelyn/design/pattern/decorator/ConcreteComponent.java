package com.evelyn.design.pattern.decorator;

/**
 * 定义了一个具体的对象，也可以给这个对象添加一些职责
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
