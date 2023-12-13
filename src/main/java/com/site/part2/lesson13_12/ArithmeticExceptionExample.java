package com.site.part2.lesson13_12;

public class ArithmeticExceptionExample {

    static int cardBalanceOne = 1000;
    static int cardBalanceTwo = 0;

    public static void main(String[] args) {
        System.out.println(sendMoneyAndGetBalance(2000));
    }

    private static int getResult(int x, int y) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        try {
            int[] array = new int[2];
            int current = array[3];
            System.out.println(current);
            return x / y;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        } finally {
            System.out.println("End operation");
        }
    }

    private static int getResultWithCheck(Integer x, Integer y) {
        if (y == null || y == 0) {
            throw new RuntimeException("Division by zero");
        }
        return x / y;
    }

    private static int sendMoneyAndGetBalance(int sum) {
        if (cardBalanceOne < sum) {
            throw new RuntimeException("Balance not enough");
        }
        cardBalanceOne = cardBalanceOne - sum;
        cardBalanceTwo = cardBalanceTwo + sum;

        return cardBalanceOne;
    }
}
