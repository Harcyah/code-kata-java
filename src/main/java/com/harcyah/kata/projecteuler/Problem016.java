package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem016 {

    public int getPowerDigitSum(int limit) {
        BigInteger bi = BigInteger.TWO;
        bi = bi.pow(limit);

        String str = bi.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.digit(str.charAt(i), 10);
        }

        return sum;
    }

}
