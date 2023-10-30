package com.site.lesson26;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // |2|2|4|5|
        int[] intArray = new int[10];
        int[] intArray2 = new int[10];
        //int[] intArray = new int[]{2, 3 ,4};
        //int[] intArray2 = {2, 3, 4};
        System.out.println(Arrays.equals(intArray, intArray2));
        System.out.println(Arrays.toString(intArray));
        intArray[2] = 100;
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray.length);

        int[][] intDubleArray = new int[2][2];
        System.out.println(Arrays.deepToString(intDubleArray));


    }
}
