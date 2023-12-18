package com.site.part2.lesson18_12;

import java.util.Scanner;

public class ValidationExceptionExample {

    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите email:");
        String email = scanner.nextLine();
        int count = 1;
        boolean success = false;

        while (count < MAX_ATTEMPTS && !success) {
            try {
                success = validateEmail(email);
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            } finally {
                if (!success) {
                    System.out.println("Осталось попыток ввода - " + (MAX_ATTEMPTS - count));
                    email = scanner.nextLine();
                    count++;
                }
            }
        }

        if (count == 5 && !success) {
            throw new ClosedExecutionException("Попытки исчерпаны, приходите позже", null);
        }

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        System.out.printf("Пользователь %s с email %s сохранен", name, email);
    }

    private static boolean validateEmail(String email) throws ValidationException {
        if (!email.contains("@")) {
            throw new ValidationException(String.format("Ввденый email недопустим '%s'", email));
        }
        return true;
    }
}
