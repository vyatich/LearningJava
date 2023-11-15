package com.site.part1.lesson26;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println(System.getProperty("java.specification.version"));

        String text = "Мой возраст - " + age;
        System.out.println(text);

        String name = scanner.nextLine();
        System.out.println(name);
    }
}
