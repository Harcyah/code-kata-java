package com.harcyah.kata.codingbat.string2.cat_dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CatDogTest {

    @Test
    void testCatDog() {
        CatDog catDog = new CatDog();
        assertTrue(catDog.catDog("catdog"));
        assertFalse(catDog.catDog("catcat"));
        assertTrue(catDog.catDog("1cat1cadodog"));
        assertFalse(catDog.catDog("catxxdogxxxdog"));
        assertTrue(catDog.catDog("catxdogxdogxcat"));
        assertFalse(catDog.catDog("catxdogxdogxca"));
        assertFalse(catDog.catDog("dogdogcat"));
        assertTrue(catDog.catDog("dogogcat"));
        assertFalse(catDog.catDog("dog"));
        assertFalse(catDog.catDog("cat"));
        assertTrue(catDog.catDog("ca"));
        assertTrue(catDog.catDog("c"));
        assertTrue(catDog.catDog(""));
    }

}
