package com.harcyah.kata.exercism.roman_numerals;

public class RomanNumeralLoopImpl {

    private static final char[] ONES = new char[]{'I', 'X', 'C', 'M'};
    private static final char[] FIVES = new char[]{'V', 'L', 'D'};

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
        switch (digit) {
            case '0':
                return "";
            case '1':
                return "" + ONES[rank];
            case '2':
                return repeat(ONES[rank], 2);
            case '3':
                return repeat(ONES[rank], 3);
            case '4':
                return "" + ONES[rank] + FIVES[rank];
            case '5':
                return "" + FIVES[rank];
            case '6':
                return FIVES[rank] + repeat(ONES[rank], 1);
            case '7':
                return FIVES[rank] + repeat(ONES[rank], 2);
            case '8':
                return FIVES[rank] + repeat(ONES[rank], 3);
            case '9':
                return "" + ONES[rank] + ONES[rank + 1];
            default:
                throw new IllegalArgumentException();
        }
    }

    private String repeat(char c, int count) {
        return String.valueOf(c).repeat(count);
    }

}
