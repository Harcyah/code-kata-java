package com.harcyah.kata.codingbat.logic1.in_order;

public class InOrder {

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? c > b : (b > a) && (c > b);
    }

}
