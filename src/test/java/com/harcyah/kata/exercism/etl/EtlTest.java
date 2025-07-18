package com.harcyah.kata.exercism.etl;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;

class EtlTest {

    private final Etl etl = new Etl();

    @Test
    void testTransformOneValue() {
        Map<Integer, List<String>> old = Map.of(1, List.of("A"));

        Map<String, Integer> expected = Map.of("a", 1);

        assertThat(etl.transform(old)).isEqualTo(expected);
    }

    @Test
    void testTransformMoreValues() {
        Map<Integer, List<String>> old = Map.of(
            1, List.of("A", "E", "I", "O", "U")
        );

        Map<String, Integer> expected = Map.of(
            "a", 1,
            "e", 1,
            "i", 1,
            "o", 1,
            "u", 1
        );

        assertThat(etl.transform(old)).isEqualTo(expected);
    }

    @Test
    void testMoreKeys() {
        Map<Integer, List<String>> old = Map.of(
            1, List.of("A", "E"),
            2, List.of("D", "G")
        );

        Map<String, Integer> expected = Map.of(
            "a", 1,
            "e", 1,
            "d", 2,
            "g", 2
        );

        assertThat(etl.transform(old)).isEqualTo(expected);
    }

    @Test
    void testFullDataset() {
        Map<Integer, List<String>> old = Map.ofEntries(
            entry(1, List.of("A", "E", "I", "O", "U", "L", "N", "R", "S", "T")),
            entry(2, List.of("D", "G")),
            entry(3, List.of("B", "C", "M", "P")),
            entry(4, List.of("F", "H", "V", "W", "Y")),
            entry(5, List.of("K")),
            entry(8, List.of("J", "X")),
            entry(10, List.of("Q", "Z"))
        );

        Map<String, Integer> expected = Map.ofEntries(
            entry("a", 1),
            entry("b", 3),
            entry("c", 3),
            entry("d", 2),
            entry("e", 1),
            entry("f", 4),
            entry("g", 2),
            entry("h", 4),
            entry("i", 1),
            entry("j", 8),
            entry("k", 5),
            entry("l", 1),
            entry("m", 3),
            entry("n", 1),
            entry("o", 1),
            entry("p", 3),
            entry("q", 10),
            entry("r", 1),
            entry("s", 1),
            entry("t", 1),
            entry("u", 1),
            entry("v", 4),
            entry("w", 4),
            entry("x", 8),
            entry("y", 4),
            entry("z", 10)
        );

        assertThat(etl.transform(old)).isEqualTo(expected);
    }

}
