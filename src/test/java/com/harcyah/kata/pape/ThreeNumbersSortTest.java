package com.harcyah.kata.pape;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeNumbersSortTest {

    private static final int[] EXPECTED = {10, 20, 30};

    @Test
    void testABC() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {10, 20, 30};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    void testACB() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {10, 30, 20};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    void testBAC() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {20, 10, 30};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    void testBCA() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {20, 30, 10};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    void testCAB() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {30, 10, 20};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    void testCBA() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {30, 20, 10};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

}
