package com.evelyn.design.pattern.decorator;

/**
 * @auther zhaoxl
 * @date 2018/5/19.
 */
public class Main {
    public static void main(String[] args) {

        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        // 装饰的方法是：首先用ConcreteComponent实例化对象c，然后实例化 a 来包装 c，再实例化 b 来包装 a，最终执行 b 的方法
        a.setComponent(c);
        b.setComponent(a);

        b.operation();
    }
}
