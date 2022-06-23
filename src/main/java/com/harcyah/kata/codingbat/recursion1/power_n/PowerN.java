package com.harcyah.kata.codingbat.recursion1.power_n;

public class PowerN {

    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }

        return base * powerN(base, n - 1);
    }

}
