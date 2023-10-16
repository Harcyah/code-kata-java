package com.harcyah.kata.exercism.roman_numerals;

public class RomanNumeralLoopImpl {

    private static final String[] ONES = new String[]{"I", "X", "C", "M"};
    private static final String[] FIVES = new String[]{"V", "L", "D"};

    public String get(int input) {
        if (input > 3000) {
            throw new IllegalArgumentException();
        }

        StringBuilder builder = new StringBuilder();
        String number = String.valueOf(input);
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(number.length() - 1 - i);
            builder.insert(0, getRomanForValue(digit, i));
        }

        return builder.toString();
    }

    private String getRomanForValue(char digit, int rank) {
        return switch (digit) {
            case '0' -> "";
            case '1' -> ONES[rank];
            case '2' -> ONES[rank].repeat(2);
            case '3' -> ONES[rank].repeat(3);
            case '4' -> ONES[rank] + FIVES[rank];
            case '5' -> FIVES[rank];
            case '6' -> FIVES[rank] + ONES[rank].repeat(1);
            case '7' -> FIVES[rank] + ONES[rank].repeat(2);
            case '8' -> FIVES[rank] + ONES[rank].repeat(3);
            case '9' -> ONES[rank] + ONES[rank + 1];
            default -> throw new IllegalArgumentException();
        };
    }

}
