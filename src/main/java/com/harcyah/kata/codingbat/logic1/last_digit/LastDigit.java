package com.harcyah.kata.codingbat.logic1.last_digit;

import java.util.HashSet;
import java.util.Set;

public class LastDigit {

    public boolean lastDigit(int a, int b, int c) {
        Set<Integer> s = new HashSet<>();
        s.add(a % 10);
        s.add(b % 10);
        s.add(c % 10);
        return s.size() <= 2;
    }

}
