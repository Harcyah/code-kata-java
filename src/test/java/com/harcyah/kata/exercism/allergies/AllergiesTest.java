package com.harcyah.kata.exercism.allergies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllergiesTest {

    @Test
    void noAllergiesMeansNotAllergicToAnything() {
        Allergies allergies = new Allergies(0);

        assertFalse(allergies.isAllergicTo(Allergen.EGGS));
        assertFalse(allergies.isAllergicTo(Allergen.PEANUTS));
        assertFalse(allergies.isAllergicTo(Allergen.STRAWBERRIES));
        assertFalse(allergies.isAllergicTo(Allergen.CATS));
    }

    @Test
    void allergicToEggs() {
        Allergies allergies = new Allergies(1);

        assertTrue(allergies.isAllergicTo(Allergen.EGGS));
    }

    @Test
    void allergicToPeanuts() {
        Allergies allergies = new Allergies(2);

        assertTrue(allergies.isAllergicTo(Allergen.PEANUTS));
    }

    @Test
    void allergicToShellfish() {
        Allergies allergies = new Allergies(4);

        assertTrue(allergies.isAllergicTo(Allergen.SHELLFISH));
    }

    @Test
    void allergicToStrawberries() {
        Allergies allergies = new Allergies(8);

        assertTrue(allergies.isAllergicTo(Allergen.STRAWBERRIES));
    }

    @Test
    void allergicToTomatoes() {
        Allergies allergies = new Allergies(16);

        assertTrue(allergies.isAllergicTo(Allergen.TOMATOES));
    }

    @Test
    void allergicToChocolate() {
        Allergies allergies = new Allergies(32);

        assertTrue(allergies.isAllergicTo(Allergen.CHOCOLATE));
    }

    @Test
    void allergicToPollen() {
        Allergies allergies = new Allergies(64);

        assertTrue(allergies.isAllergicTo(Allergen.POLLEN));
    }

    @Test
    void allergicToCats() {
        Allergies allergies = new Allergies(128);

        assertTrue(allergies.isAllergicTo(Allergen.CATS));
    }

    @Test
    void isAllergicToEggsInAdditionToOtherStuff() {
        Allergies allergies = new Allergies(5);

        assertTrue(allergies.isAllergicTo(Allergen.EGGS));
    }

    @Test
    void noAllergies() {
        Allergies allergies = new Allergies(0);

        assertEquals(0, allergies.getList().size());
    }

    @Test
    void isAllergicToJustEggs() {
        Allergies allergies = new Allergies(1);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{Allergen.EGGS});

        assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    void isAllergicToJustPeanuts() {
        Allergies allergies = new Allergies(2);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{Allergen.PEANUTS});

        assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    void isAllergicToJustStrawberries() {
        Allergies allergies = new Allergies(8);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{Allergen.STRAWBERRIES});

        assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    void isAllergicToEggsAndPeanuts() {
        Allergies allergies = new Allergies(3);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{
            Allergen.EGGS,
            Allergen.PEANUTS
        });

        assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    void isAllergicToEggsAndShellfish() {
        Allergies allergies = new Allergies(5);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{
            Allergen.EGGS,
            Allergen.SHELLFISH
        });

        assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    void isAllergicToLotsOfStuff() {
        Allergies allergies = new Allergies(248);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{
            Allergen.STRAWBERRIES,
            Allergen.TOMATOES,
            Allergen.CHOCOLATE,
            Allergen.POLLEN,
            Allergen.CATS
        });

        assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    void isAllergicToEverything() {
        Allergies allergies = new Allergies(255);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{
            Allergen.EGGS,
            Allergen.PEANUTS,
            Allergen.SHELLFISH,
            Allergen.STRAWBERRIES,
            Allergen.TOMATOES,
            Allergen.CHOCOLATE,
            Allergen.POLLEN,
            Allergen.CATS
        });

        assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    void ignoreNonAllergenScoreParts() {
        Allergies allergies = new Allergies(509);
        List<Allergen> expectedAllergens = List.of(new Allergen[]{
            Allergen.EGGS,
            Allergen.SHELLFISH,
            Allergen.STRAWBERRIES,
            Allergen.TOMATOES,
            Allergen.CHOCOLATE,
            Allergen.POLLEN,
            Allergen.CATS
        });

        assertEquals(expectedAllergens, allergies.getList());
    }

}
