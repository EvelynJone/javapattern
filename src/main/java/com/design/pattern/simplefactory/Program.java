package com.design.pattern.simplefactory;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 * @auther zhaoxl
 * @date 2018/5/14.
 */
public class Program {

    public static void main(String[] args) throws IOException {
        System.out.println("please input number A : ");
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        System.out.println("please choose calculating signs (+,-,*,/): ");
        String B = scanner.next();

        System.out.println("please input number B : ");
        String C = scanner.next();

        Double D = null ;

        if (B == "+")
            D = Double.valueOf(A) + Double.valueOf(C);

        if (B == "-")
            D = Double.valueOf(A) - Double.valueOf(C);

        if (B == "*")
            D = Double.valueOf(A) * Double.valueOf(C);

        if (B == "/")
            D = Double.valueOf(A) / Double.valueOf(C);

        System.out.println("result : " + D);
    }
}
