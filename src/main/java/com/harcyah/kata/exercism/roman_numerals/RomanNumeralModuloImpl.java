package com.harcyah.kata.exercism.roman_numerals;

public class RomanNumeralModuloImpl {

    private static final String[] ONES = new String[]{"I", "X", "C", "M"};
    private static final String[] FIVES = new String[]{"V", "L", "D"};

    public String get(int input) {
        if (input > 3000) {
            throw new IllegalArgumentException();
        }

        return getRomanForValue(input / 1000, 3)
            + getRomanForValue(input % 1000 / 100, 2)
            + getRomanForValue(input % 100 / 10, 1)
            + getRomanForValue(input % 10, 0);
    }

    private String getRomanForValue(int digit, int rank) {
        return switch (digit) {
            case 0 -> "";
            case 1 -> ONES[rank];
            case 2 -> ONES[rank].repeat(2);
            case 3 -> ONES[rank].repeat(3);
            case 4 -> ONES[rank] + FIVES[rank];
            case 5 -> FIVES[rank];
            case 6 -> FIVES[rank] + ONES[rank].repeat(1);
            case 7 -> FIVES[rank] + ONES[rank].repeat(2);
            case 8 -> FIVES[rank] + ONES[rank].repeat(3);
            case 9 -> ONES[rank] + ONES[rank + 1];
            default -> throw new IllegalArgumentException();
        };
    }

}
