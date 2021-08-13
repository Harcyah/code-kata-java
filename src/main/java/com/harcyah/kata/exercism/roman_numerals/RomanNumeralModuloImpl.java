package com.harcyah.kata.exercism.roman_numerals;

public class RomanNumeralModuloImpl {

    private static final char[] ONES = new char[]{'I', 'X', 'C', 'M'};
    private static final char[] FIVES = new char[]{'V', 'L', 'D'};

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
        switch (digit) {
            case 0:
                return "";
            case 1:
                return "" + ONES[rank];
            case 2:
                return repeat(ONES[rank], 2);
            case 3:
                return repeat(ONES[rank], 3);
            case 4:
                return "" + ONES[rank] + FIVES[rank];
            case 5:
                return "" + FIVES[rank];
            case 6:
                return FIVES[rank] + repeat(ONES[rank], 1);
            case 7:
                return FIVES[rank] + repeat(ONES[rank], 2);
            case 8:
                return FIVES[rank] + repeat(ONES[rank], 3);
            case 9:
                return "" + ONES[rank] + ONES[rank + 1];
            default:
                throw new IllegalArgumentException();
        }
    }

    private String repeat(char c, int count) {
        return String.valueOf(c).repeat(count);
    }

}
