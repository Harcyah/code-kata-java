package com.harcyah.kata.codingbat.logic1.sorta_sum;

public class SortaSum {

    public int sortaSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <= 19) ? 20 : sum;
    }

}
