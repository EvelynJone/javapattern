package com.evelyn.design.pattern.decorator;

/**
 * 装饰抽象类：从外类来扩展Component类的功能，
 * 但对于Component来说，是无需知道Decorator的存在的
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
