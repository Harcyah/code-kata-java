package com.harcyah.kata.misc.poker.values;

public enum Value {

    VALUE_2,
    VALUE_3,
    VALUE_4,
    VALUE_5,
    VALUE_6,
    VALUE_7,
    VALUE_8,
    VALUE_9,
    VALUE_T,
    VALUE_J,
    VALUE_Q,
    VALUE_K,
    VALUE_A;

    @Override
    public String toString() {
        return this.name().substring(6);
    }

    public static Value parse(String letter) throws IllegalValueException {
        try {
            return Value.valueOf("VALUE_" + letter);
        } catch (Exception e) {
            throw new IllegalValueException("Letter " + letter + " is not valid Value");
        }
    }

}
