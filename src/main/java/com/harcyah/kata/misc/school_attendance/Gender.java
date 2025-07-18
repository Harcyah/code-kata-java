package com.harcyah.kata.misc.school_attendance;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
public enum Gender {

    FEMALE(Set.of("f", "F", "Female")),
    MALE(Set.of("m", "M", "Male"));

    private final Set<String> tokens;

    public static Gender from(String value) {
        if (MALE.tokens.contains(value)) {
            return MALE;
        }
        if (FEMALE.tokens.contains(value)) {
            return FEMALE;
        }
        throw new IllegalArgumentException(value + " is unsupported");
    }

}
