package com.harcyah.kata.misc.poker.suits;

public enum Suit {

    SUIT_C,
    SUIT_D,
    SUIT_H,
    SUIT_S;

    @Override
    public String toString() {
        return this.name().substring(5);
    }

    public static Suit parse(String letter) throws IllegalSuitException {
        try {
            return Suit.valueOf("SUIT_" + letter);
        } catch (Exception e) {
            throw new IllegalSuitException("Letter " + letter + " is not valid Suit");
        }
    }

}
