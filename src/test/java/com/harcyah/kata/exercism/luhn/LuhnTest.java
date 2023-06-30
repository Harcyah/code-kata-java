package com.harcyah.kata.exercism.luhn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LuhnTest {

    @Test
    void checkDigitIsRightMostDigit() {
        Luhn luhn = new Luhn(34567);
        int expectedOutput = 7;

        assertEquals(expectedOutput, luhn.getCheckDigit());
    }

    @Test
    void addendsDoublesEveryOtherNumberFromRight() {
        Luhn luhn = new Luhn(12121);

        assertEquals("14141", luhn.getAddends());
    }

    @Test
    void addendsSubtracts9WhenDoubledNumberIsMoreThan9() {
        Luhn luhn = new Luhn(8631);

        assertEquals("7661", luhn.getAddends());
    }

    @Test
    void checkSumAddsAddendsTogether1() {
        Luhn luhn = new Luhn(4913);
        int expectedOutput = 22;

        assertEquals(expectedOutput, luhn.getCheckSum());
    }

    @Test
    void checkSumAddsAddendsTogether2() {
        Luhn luhn = new Luhn(201773);
        int expectedOutput = 21;

        assertEquals(expectedOutput, luhn.getCheckSum());
    }

    @Test
    void numberIsValidWhenChecksumMod10IsZero1() {
        Luhn luhn = new Luhn(738);
        boolean expectedOutput = false;

        assertEquals(expectedOutput, luhn.isValid());
    }

    @Test
    void numberIsValidWhenChecksumMod10IsZero2() {
        Luhn luhn = new Luhn(8739567);
        boolean expectedOutput = true;

        assertEquals(expectedOutput, luhn.isValid());
    }

    @Test
    void luhnCanCreateSimpleNumbersWithValidCheckDigit() {
        long expectedOutput = 1230;

        assertEquals(expectedOutput, Luhn.create(123));
    }

    @Test
    void luhnCanCreateLargeNumbersWithValidCheckDigit() {
        long expectedOutput = 8739567;

        assertEquals(expectedOutput, Luhn.create(873956));
    }

    @Test
    void luhnCanCreateHugeNumbersWithValidCheckDigit() {
        long expectedOutput = 8372637564L;

        assertEquals(expectedOutput, Luhn.create(837263756));
    }

}
