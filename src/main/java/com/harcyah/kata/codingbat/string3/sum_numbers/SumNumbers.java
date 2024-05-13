package com.harcyah.kata.codingbat.string3.sum_numbers;

public class SumNumbers {

    public int sumNumbers(String source) {
        int sum = 0;
        StringBuilder accumulator = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (Character.isDigit(c)) {
                accumulator.append(c);
            } else {
                if (accumulator.length() > 0) {
                    sum += Integer.parseInt(accumulator.toString());
                    accumulator = new StringBuilder();
                }
            }
        }
        if (accumulator.length() > 0) {
            sum += Integer.parseInt(accumulator.toString());
        }
        return sum;
    }

}
