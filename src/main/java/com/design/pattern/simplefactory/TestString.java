package com.design.pattern.simplefactory;

import java.util.Scanner;

/**
 * @auther zhaoxl
 * @date 2018/5/14.
 */
public class TestString {

    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";

        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.next();

        System.out.println(s == s1);

        System.out.println(s == s2);
        System.out.println(s.equals(s2));
    }
}
