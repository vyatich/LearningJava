package com.site.part2.lesson01_12;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Integer> multiply = num -> num * num;

        System.out.println(multiply.apply(10));
    }
}
