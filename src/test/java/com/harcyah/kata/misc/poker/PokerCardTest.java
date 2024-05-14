package com.harcyah.kata.misc.poker;

import com.harcyah.kata.misc.poker.suits.IllegalSuitException;
import com.harcyah.kata.misc.poker.suits.Suit;
import com.harcyah.kata.misc.poker.values.IllegalValueException;
import com.harcyah.kata.misc.poker.values.Value;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerCardTest {

    @Test
    void testConstructor() throws Exception {
        PokerCard card = new PokerCard("2C");
        assertEquals(Value.VALUE_2, card.getValue());
        assertEquals(Suit.SUIT_C, card.getSuit());
    }

    @Test
    void testConstructorUnexpectedSuit() {
        assertThatThrownBy(() -> new PokerCard("2X"))
            .isInstanceOf(IllegalSuitException.class);
    }

    @Test
    void testConstructorUnexpectedValue() {
        assertThatThrownBy(() -> new PokerCard("ZS"))
            .isInstanceOf(IllegalValueException.class);
    }

    @Test
    void testCompareToEqualCards() throws Exception {
        PokerCard cardC2 = new PokerCard("2C");
        PokerCard cardS2 = new PokerCard("2S");
        assertThat(cardC2).isEqualByComparingTo(cardS2);
        assertThat(cardS2).isEqualByComparingTo(cardC2);
    }

    @Test
    void testCompareToDistinctCards() throws Exception {
        PokerCard cardC2 = new PokerCard("2C");
        PokerCard cardSA = new PokerCard("AS");
        assertThat(cardC2).isLessThan(cardSA);
        assertThat(cardSA).isGreaterThan(cardC2);
    }

}
