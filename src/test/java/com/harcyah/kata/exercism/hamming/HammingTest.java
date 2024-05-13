package com.harcyah.kata.exercism.hamming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class HammingTest {

    @Test
    void testNoDifferenceBetweenIdenticalStrands() {
        assertThat(Hamming.compute("A", "A")).isZero();
    }

    @Test
    void testCompleteHammingDistanceOfForSingleNucleotideStrand() {
        assertThat(Hamming.compute("A", "G")).isEqualTo(1);
    }

    @Test
    void testCompleteHammingDistanceForSmallStrand() {
        assertThat(Hamming.compute("AG", "CT")).isEqualTo(2);
    }

    @Test
    void testSmallHammingDistance() {
        assertThat(Hamming.compute("AT", "CT")).isEqualTo(1);
    }

    @Test
    void testSmallHammingDistanceInLongerStrand() {
        assertThat(Hamming.compute("GGACG", "GGTCG")).isEqualTo(1);
    }

    @Test
    void testValidatesFirstStrandNotLonger() {
        assertThatThrownBy(() -> Hamming.compute("AAAG", "AAA"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testValidatesOtherStrandNotLonger() {
        assertThatThrownBy(() -> Hamming.compute("AAA", "AAAG"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testLargeHammingDistance() {
        assertThat(Hamming.compute("GATACA", "GCATAA")).isEqualTo(4);
    }

    @Test
    void testHammingDistanceInVeryLongStrand() {
        assertThat(Hamming.compute("GGACGGATTCTG", "AGGACGGATTCT")).isEqualTo(9);
    }

}
