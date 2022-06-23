package com.harcyah.kata.codingbat.warmup1.near_hundred;

public class NearHundred {

    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

}
