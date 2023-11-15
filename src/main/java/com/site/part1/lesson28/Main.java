package com.site.part1.lesson28;

public class Main {

    public static void main(String[] args) {
        Fruit apple1 = new Fruit();
        apple1.setName("APPLE");

        Fruit apple2 = apple1.clone();

        System.out.println(apple2);
        System.out.println(apple1);

        System.out.println(apple2.equals(apple1));
        System.out.println(apple1.hashCode());
        System.out.println(apple2.hashCode());
    }
}
