package com.evelyn.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("product create ---");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
