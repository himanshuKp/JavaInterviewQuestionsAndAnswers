package com.in28minutes.java.streams;

import com.in28minutes.java.streams.functionalInterface.MyCalculator;

public class FunctionalInterfaceImpl1 {
    public static void main(String[] args) {
        MyCalculator myCalculator = (int a, int b, int c) -> a + b + c;

        System.out.println(myCalculator.add(10, 20, 30));
    }
}
