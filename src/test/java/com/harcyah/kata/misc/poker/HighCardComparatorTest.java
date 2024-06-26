package com.harcyah.kata.misc.poker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HighCardComparatorTest {

    private final HighCardComparator comparator = new HighCardComparator();

    @Test
    void compareSimilarHands() throws Exception {
        PokerHand left = new PokerHand("2S 3S 4S 5S 6S");
        PokerHand right = new PokerHand("2D 3D 4D 5D 6D");
        assertThat(comparator.compare(left, right)).isZero();
    }

    @Test
    void compareDifferentHands() throws Exception {
        PokerHand left = new PokerHand("2S 3S 4S 5S 6S");
        PokerHand right = new PokerHand("2D 3D 4D 5D 7D");
        assertThat(comparator.compare(left, right)).isNegative();
        assertThat(comparator.compare(right, left)).isPositive();
    }

}
