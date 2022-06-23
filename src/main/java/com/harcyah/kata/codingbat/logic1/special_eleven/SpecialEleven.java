package com.harcyah.kata.codingbat.logic1.special_eleven;

public class SpecialEleven {

    public boolean specialEleven(int n) {
        return ((n % 11) == 0) || (((n - 1) % 11) == 0);
    }

}
