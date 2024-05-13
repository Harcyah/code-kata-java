package com.harcyah.kata.misc.excel;

public class ExcelNumberingWhileImpl {

    public String getLabel(int number) {
        StringBuilder out = new StringBuilder();
        while (number > 26) {
            int q = number / 26;
            int r = number % 26;
            out.insert(0, toAlphabeticChar(r));
            number = q;
        }
        out.insert(0, toAlphabeticChar(number));
        return out.toString();
    }

    protected char toAlphabeticChar(int value) {
        return (char) (('A' + value) - 1);
    }

}
