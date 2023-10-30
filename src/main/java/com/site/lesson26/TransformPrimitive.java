package com.site.lesson26;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TransformPrimitive {

    public static void main(String[] args) {
        short short1 = 130;
        int int1 = short1;
        System.out.println(int1);

        byte b1 = (byte) short1;
        System.out.println(b1);

        char ch1 = 99;
        System.out.println(int1 + ch1);

        float f1 = 124.4f;
        double d1 = f1 + 3423.3;

        BigDecimal bigDecimal1 = null;

        System.out.println(Double.POSITIVE_INFINITY);
    }
}
