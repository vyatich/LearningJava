package com.site.part2.lessson29_11.generics;

import java.util.Scanner;

public class GenericExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer int1 = Integer.valueOf(scanner.nextLine());
        Integer int2 = Integer.valueOf(scanner.nextLine());
        System.out.println(max(int1, int2));

        Long long1 = Long.valueOf(scanner.nextLine());
        Long long2 = Long.valueOf(scanner.nextLine());
        System.out.println(max(long1, long2));

        Double double1 = Double.valueOf(scanner.nextLine());
        Double double2 = Double.valueOf(scanner.nextLine());
        System.out.println(max(double1, double2));
    }

    private static <T extends Number> T max(T t1, T t2) {
        return  t1.doubleValue() > t2.doubleValue() ? t1 : t2;
    }
}
