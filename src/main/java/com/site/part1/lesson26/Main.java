package com.site.part1.lesson26;

public class Main {

    public static void main(String[] args) {
        //примитивы
        boolean isMen = true; //false
        Boolean booleanExample = true;
        System.out.println(booleanExample);
        //целочисленные
        byte byteExample = 121; //1 байт = 8 бит   -128...127 -2^7...2^7-1
        Byte b1 = 120;
        short shortExample = 2312;//2 байта = 16 бит -2^15...2^15-1 -32768...32767
        Short sh1 = 2312;
        int intExample = 1200023; //4 байта = 32 бита -2^31...2^31-1
        Integer int1 = 123123;
        long longExample = 124432525235L;//8 байт = 64 бита -2^63...2^63-1
        Long long1 = 124124L;
        //с плавающей точкой
        float floatExample = 123.4F; //4 байта
        Float float1 = 12414.12F;
        double doubleExample = 123.5; //8 байт
        Double double2 = 322523.23523;
        //символьные
        char charExample1 = 1047; //0...65536
        Character char2 = 'c';
        System.out.println(charExample1);
        char charExample2 = 'p';
        System.out.println(charExample2);

        //ссылочные типы
        String name; //по умолчанию null


        final int number1 = 10;
        int number2 = 20;
        System.out.println(number2);
        number2 = 35;
        System.out.println(number2);
    }
}
