package com.site.lesson26;

public class Expressions {

    public static void main(String[] args) {
        boolean isMen = true;

        if (isMen)
            System.out.println("Men");
        else
            System.out.println("Women");

        String text = isMen ? "Men" : "Women";
        System.out.println(text);

        int age = 50;

        if (age < 10) {
            System.out.println("Age less than 10");
        } else if (age < 20) {
            System.out.println("Age less than 20");
        } else if (age == 30) {
            System.out.println("bingo");
        } else {
            System.out.println("Who are you?");
        }


    }
}
