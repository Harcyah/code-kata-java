package com.harcyah.kata.exercism.food_chain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodChainTest {
    private FoodChain foodChain;

    @BeforeEach
    void setup() {
        foodChain = new FoodChain();
    }

    @Test
    void fly() {
        int verse = 1;
        String expected = "I know an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void spider() {
        int verse = 2;
        String expected = "I know an old lady who swallowed a spider.\n" +
                "It wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void bird() {
        int verse = 3;
        String expected = "I know an old lady who swallowed a bird.\n" +
                "How absurd to swallow a bird!\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void cat() {
        int verse = 4;
        String expected = "I know an old lady who swallowed a cat.\n" +
                "Imagine that, to swallow a cat!\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void dog() {
        int verse = 5;
        String expected = "I know an old lady who swallowed a dog.\n" +
                "What a hog, to swallow a dog!\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void goat() {
        int verse = 6;
        String expected = "I know an old lady who swallowed a goat.\n" +
                "Just opened her throat and swallowed a goat!\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void cow() {
        int verse = 7;
        String expected = "I know an old lady who swallowed a cow.\n" +
                "I don't know how she swallowed a cow!\n" +
                "She swallowed the cow to catch the goat.\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void horse() {
        int verse = 8;
        String expected = "I know an old lady who swallowed a horse.\n" +
                "She's dead, of course!";

        assertEquals(expected, foodChain.verse(verse));
    }

    @Test
    void multipleVerses() {
        int startVerse = 1;
        int endVerse = 3;
        String expected = "I know an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a spider.\n" +
                "It wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a bird.\n" +
                "How absurd to swallow a bird!\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";

        assertEquals(expected, foodChain.verses(startVerse, endVerse));
    }

    @Test
    void wholeSong() {
        int startVerse = 1;
        int endVerse = 8;
        String expected = "I know an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a spider.\n" +
                "It wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a bird.\n" +
                "How absurd to swallow a bird!\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a cat.\n" +
                "Imagine that, to swallow a cat!\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a dog.\n" +
                "What a hog, to swallow a dog!\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a goat.\n" +
                "Just opened her throat and swallowed a goat!\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a cow.\n" +
                "I don't know how she swallowed a cow!\n" +
                "She swallowed the cow to catch the goat.\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.\n" +
                "\n" +
                "I know an old lady who swallowed a horse.\n" +
                "She's dead, of course!";

        assertEquals(expected, foodChain.verses(startVerse, endVerse));
    }

}
