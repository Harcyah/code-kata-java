package com.harcyah.kata.codingbat.string3.count_y_z;

public class CountYZ {

    public int count(String source) {
        String testable = source.toLowerCase() + " ";
        int counter = 0;
        for (int i = 0; i < (testable.length() - 1); i++) {
            int c = testable.charAt(i);
            int a = testable.charAt(i + 1);
            counter += (((c == 'z') || (c == 'y')) && !Character.isLetter(a)) ? 1 : 0;
        }
        return counter;
    }

}
