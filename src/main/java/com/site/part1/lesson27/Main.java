package com.site.part1.lesson27;

public class Main {

    public static void main(String[] args) {
//        int sum = 0;
////        for (int i = 1; i < 9; i++) {
////            sum = sum + i;
////        }
//        System.out.println(sum);

//        int[] numbers = {1, 2, 3, 4};
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + i;
//            System.out.println(numbers[i]);
//        }
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


//        do {
//            System.out.println(j);
//            j++;
//        } while (j < 10);
    }
}
