package com.evelyn.design.pattern.builder;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("part X");
    }

    @Override
    public void buildPartB() {
        product.add("part Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
