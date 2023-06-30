package com.harcyah.kata.codingbat.warmup2.no_triples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NoTriplesTest {

    @Test
    void testNoTriples() {
        NoTriples noTriples = new NoTriples();
        assertTrue(noTriples.noTriples(new int[]{1, 1, 2, 2, 1}));
        assertFalse(noTriples.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        assertFalse(noTriples.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        assertTrue(noTriples.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1}));
        assertTrue(noTriples.noTriples(new int[]{1, 2, 1}));
        assertFalse(noTriples.noTriples(new int[]{1, 1, 1}));
        assertTrue(noTriples.noTriples(new int[]{1, 1}));
        assertTrue(noTriples.noTriples(new int[]{1}));
        assertTrue(noTriples.noTriples(new int[]{}));
    }

}
