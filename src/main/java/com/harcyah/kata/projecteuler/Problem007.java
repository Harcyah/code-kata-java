package com.harcyah.kata.projecteuler;

import java.io.IOException;
import java.util.List;

import static com.harcyah.kata.ResourceLoader.loadLines;

public class Problem007 {

    protected List<Integer> primes;

    public Problem007() throws NumberFormatException, IOException {
        primes = loadLines("/com/harcyah/kata/projecteuler/projecteuler_007.txt")
            .stream()
            .map(Integer::parseInt)
            .toList();
    }

    public long getNthPrime(int nth) throws NumberFormatException {
        return primes.get(nth - 1);
    }

}
