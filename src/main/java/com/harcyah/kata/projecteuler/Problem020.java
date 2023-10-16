package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem020 {

    public int getFactorialDigitSum(int limit) {
        BigInteger bi = BigInteger.ONE;
        for (int i = 1; i < (limit + 1); i++) {
            BigInteger b = BigInteger.valueOf(i);
            bi = bi.multiply(b);
        }

        String str = bi.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.digit(str.charAt(i), 10);
        }

        return sum;
    }

}
