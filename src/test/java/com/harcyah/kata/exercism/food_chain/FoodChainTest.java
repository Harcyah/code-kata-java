package com.harcyah.kata.exercism.food_chain;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodChainTest {

    private final FoodChain sut = new FoodChain();

    @ParameterizedTest
    @EnumSource(FoodChainFixture.class)
    void verse(FoodChainFixture fixture) {
        // Given
        int verse = fixture.verse;
        String expected = fixture.expected;

        assertEquals(expected, sut.verse(verse));
    }

    @AllArgsConstructor
    private enum FoodChainFixture {
        FLY(1, """
            I know an old lady who swallowed a fly.
            I don't know why she swallowed the fly. Perhaps she'll die."""),
        SPIDER(2, """
            I know an old lady who swallowed a spider.
            It wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die."""),
        BIRD(3, """
            I know an old lady who swallowed a bird.
            How absurd to swallow a bird!
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die."""),
        CAT(4, """
            I know an old lady who swallowed a cat.
            Imagine that, to swallow a cat!
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die."""),
        DOG(5, """
            I know an old lady who swallowed a dog.
            What a hog, to swallow a dog!
            She swallowed the dog to catch the cat.
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die."""),
        GOAT(6, """
            I know an old lady who swallowed a goat.
            Just opened her throat and swallowed a goat!
            She swallowed the goat to catch the dog.
            She swallowed the dog to catch the cat.
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die."""),
        COW(7, """
            I know an old lady who swallowed a cow.
            I don't know how she swallowed a cow!
            She swallowed the cow to catch the goat.
            She swallowed the goat to catch the dog.
            She swallowed the dog to catch the cat.
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die."""),
        HORSE(8, """
            I know an old lady who swallowed a horse.
            She's dead, of course!""");

        private final int verse;
        private final String expected;

    }

    @Test
    void multipleVerses() {
        int startVerse = 1;
        int endVerse = 3;
        String expected = """
            I know an old lady who swallowed a fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a spider.
            It wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a bird.
            How absurd to swallow a bird!
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.""";

        assertEquals(expected, sut.verses(startVerse, endVerse));
    }

    @Test
    void wholeSong() {
        int startVerse = 1;
        int endVerse = 8;
        String expected = """
            I know an old lady who swallowed a fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a spider.
            It wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a bird.
            How absurd to swallow a bird!
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a cat.
            Imagine that, to swallow a cat!
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a dog.
            What a hog, to swallow a dog!
            She swallowed the dog to catch the cat.
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a goat.
            Just opened her throat and swallowed a goat!
            She swallowed the goat to catch the dog.
            She swallowed the dog to catch the cat.
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a cow.
            I don't know how she swallowed a cow!
            She swallowed the cow to catch the goat.
            She swallowed the goat to catch the dog.
            She swallowed the dog to catch the cat.
            She swallowed the cat to catch the bird.
            She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.
            She swallowed the spider to catch the fly.
            I don't know why she swallowed the fly. Perhaps she'll die.

            I know an old lady who swallowed a horse.
            She's dead, of course!""";

        assertEquals(expected, sut.verses(startVerse, endVerse));
    }

}
