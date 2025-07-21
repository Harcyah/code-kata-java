package com.harcyah.kata.exercism.sieve;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Sieve {

    private final int value;

    public List<Integer> getPrimes() {
        boolean[] numbers = new boolean[value + 1];

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i]) {
                continue;
            }

            // mark all multiples
            for (int j = i + 1; j < numbers.length; j++) {
                if (j % i == 0) {
                    numbers[j] = true;
                }
            }
        }

        // keep only non marked numbers
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < numbers.length; i++) {
            if (!numbers[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

}
