package com.harcyah.kata.exercism.prime_factors;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class PrimeFactors {

    public static List<Long> getForNumber(long input) {
        if (input == 1) {
            return List.of();
        }

        List<Long> factors = new ArrayList<>();
        long root = (int) Math.floor(Math.sqrt(input));
        for (long i = 2; i <= root; i++) {
            long mod = input % i;
            if (mod == 0) {
                factors.add(i);
                factors.addAll(getForNumber(input / i));
                break;
            }
        }
        if (factors.isEmpty()) {
            factors.add(input);
        }
        return factors;
    }

}
