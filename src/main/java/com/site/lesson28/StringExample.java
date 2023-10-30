package com.site.lesson28;

public class StringExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Привет ");
        stringBuilder.append("МИР ");
        stringBuilder.append(". I love java!");
        stringBuilder.append(" Буду кодить всю ночь!");

        String text = stringBuilder.toString();

        System.out.println(text);
    }
}
