package com.harcyah.kata.exercism.custom_set;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("unchecked")
class CustomSetTest {

    @Test
    void setsWithNoElementsAreEmpty() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isEmpty();
        assertTrue(actual);
    }

    @Test
    void setsWithElementsAreNotEmpty() {
        final boolean actual = new CustomSet<>(List.of(1))
            .isEmpty();

        assertFalse(actual);
    }

    @Test
    void nothingIsContainedInAnEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .contains(1);

        assertFalse(actual);
    }

    @Test
    void whenTheElementIsInTheSet() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .contains(1);

        assertTrue(actual);
    }

    @Test
    void whenTheElementIsNotInTheSet() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .contains(4);

        assertFalse(actual);
    }

    @Test
    void emptySetIsASubsetOfAnotherEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isSubset(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    void emptySetIsASubsetOfNonEemptySet() {
        final boolean actual = new CustomSet<>(List.of(1))
            .isSubset(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    void nonEmptySetIsNotASubsetOfEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isSubset(
                new CustomSet<>(List.of(1)));

        assertFalse(actual);
    }

    @Test
    void setIsASubsetOfSetWithExactSameElements() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .isSubset(
                new CustomSet<>(List.of(1, 2, 3)));

        assertTrue(actual);
    }

    @Test
    void setIsASubsetOfLargerSetWithSameElements() {
        final boolean actual = new CustomSet<>(List.of(4, 1, 2, 3))
            .isSubset(
                new CustomSet<>(List.of(1, 2, 3)));

        assertTrue(actual);
    }

    @Test
    void setIsNotASubsetOfSetThatDoesNotContainItsElements() {
        final boolean actual = new CustomSet<>(List.of(4, 1, 3))
            .isSubset(
                new CustomSet<>(List.of(1, 2, 3)));

        assertFalse(actual);
    }

    @Test
    void theEmptySetIsDisjointWithItself() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isDisjoint(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    void emptySetIsDisjointWithNonEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isDisjoint(
                new CustomSet<>(List.of(1)));

        assertTrue(actual);
    }

    @Test
    void nonEmptySetIsDisjointWithEmptySet() {
        final boolean actual = new CustomSet<>(List.of(1))
            .isDisjoint(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    void setsAreNotDisjointIfTheyShareAnElement() {
        final boolean actual = new CustomSet<>(List.of(1, 2))
            .isDisjoint(
                new CustomSet<>(List.of(2, 3)));

        assertFalse(actual);
    }

    @Test
    void setsAreDisjointIfTheyShareNoElements() {
        final boolean actual = new CustomSet<>(List.of(1, 2))
            .isDisjoint(
                new CustomSet<>(List.of(3, 4)));

        assertTrue(actual);
    }

    @Test
    void emptySetsAreEqual() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .equals(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    void emptySetIsNotEqualToNonEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .equals(
                new CustomSet<>(List.of(1, 2, 3)));

        assertFalse(actual);
    }

    @Test
    void nonEmptySetIsNotEqualToEmptySet() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .equals(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertFalse(actual);
    }

    @Test
    void setsWithTheSameElementsAreEqual() {
        final boolean actual = new CustomSet<>(List.of(1, 2))
            .equals(
                new CustomSet<>(List.of(2, 1)));

        assertTrue(actual);
    }

    @Test
    void setsWithDifferentElementsAreNotEqual() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .equals(
                new CustomSet<>(List.of(1, 2, 4)));

        assertFalse(actual);
    }

    @Test
    void addToEmptySet() {
        final int element = 3;
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(element)));
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST);

        actual.add(element);

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void addToNonEmptySet() {
        final int element = 3;
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(1, 2, 3, 4)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 4));

        actual.add(element);

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void addingAnExistingElementDoesNotChangeTheSet() {
        final int element = 3;
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(1, 2, 3)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3));

        actual.add(element);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    void intersectionOfTwoEmptySetsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getIntersection(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    void intersectionOfAnEmptySetAndNonEmptySetIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getIntersection(
                new CustomSet<>(List.of(3, 2, 5)));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    void intersectionOfANonEmptySetAndAnEmptySetIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3, 4))
            .getIntersection(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());

    }

    @Test
    void intersectionOfTwoSetsWithNoSharedElementsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3))
            .getIntersection(
                new CustomSet<>(List.of(4, 5, 6)));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    void intersectionOfTwoSetsWithSharedElementsIsASetOfTheSharedElements() {
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(2, 3)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3, 4))
            .getIntersection(
                new CustomSet<>(List.of(3, 2, 5)));

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void differenceOfTwoEmptySetsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getDifference(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    void differenceOfAnEmptySetAndNonEmptySetIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getDifference(
                new CustomSet<>(List.of(3, 2, 5)));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    void differenceOfANonEmptySetAndAnEmptySetIsTheNonEmptySet() {
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(1, 2, 3, 4)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3, 4))
            .getDifference(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void differenceOfTwoNonEmptySetsIsASetOfElementsThatAreOnlyInTheFirstSet() {
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(1, 3)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(3, 2, 1))
            .getDifference(
                new CustomSet<>(List.of(2, 4)));

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void unionOfTwoEmptySetsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getUnion(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    void unionOfAnEmptySetAndNonEmptySetIsTheNonEmptySet() {
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(2)));
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getUnion(
                new CustomSet<>(List.of(2)));

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void unionOfANonEmptySetAndAnEmptySetIsTheNonEmptySet() {
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(1, 3)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 3))
            .getUnion(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void unionOfTwoNonEmptySetsContainsAllUniqueElements() {
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(3, 2, 1)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 3))
            .getUnion(
                new CustomSet<>(List.of(2, 3)));

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

}
