package com.site.lesson224;

import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextDouble();
        double two = scanner.nextDouble();
        double three = scanner.nextDouble();

        double avg = (one + two + three) / 3;
        System.out.printf("%.5f \n %s", avg);
    }
}
