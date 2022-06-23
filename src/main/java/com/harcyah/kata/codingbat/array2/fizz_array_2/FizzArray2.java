package com.harcyah.kata.codingbat.array2.fizz_array_2;

public class FizzArray2 {

    public String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

}

