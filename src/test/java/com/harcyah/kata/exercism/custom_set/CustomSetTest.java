package com.harcyah.kata.exercism.custom_set;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("unchecked")
public class CustomSetTest {

    @Test
    public void setsWithNoElementsAreEmpty() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isEmpty();
        assertTrue(actual);
    }

    @Test
    public void setsWithElementsAreNotEmpty() {
        final boolean actual = new CustomSet<>(List.of(1))
            .isEmpty();

        assertFalse(actual);
    }

    @Test
    public void nothingIsContainedInAnEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .contains(1);

        assertFalse(actual);
    }

    @Test
    public void whenTheElementIsInTheSet() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .contains(1);

        assertTrue(actual);
    }

    @Test
    public void whenTheElementIsNotInTheSet() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .contains(4);

        assertFalse(actual);
    }

    @Test
    public void emptySetIsASubsetOfAnotherEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isSubset(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    public void emptySetIsASubsetOfNonEemptySet() {
        final boolean actual = new CustomSet<>(List.of(1))
            .isSubset(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    public void nonEmptySetIsNotASubsetOfEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isSubset(
                new CustomSet<>(List.of(1)));

        assertFalse(actual);
    }

    @Test
    public void setIsASubsetOfSetWithExactSameElements() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .isSubset(
                new CustomSet<>(List.of(1, 2, 3)));

        assertTrue(actual);
    }

    @Test
    public void setIsASubsetOfLargerSetWithSameElements() {
        final boolean actual = new CustomSet<>(List.of(4, 1, 2, 3))
            .isSubset(
                new CustomSet<>(List.of(1, 2, 3)));

        assertTrue(actual);
    }

    @Test
    public void setIsNotASubsetOfSetThatDoesNotContainItsElements() {
        final boolean actual = new CustomSet<>(List.of(4, 1, 3))
            .isSubset(
                new CustomSet<>(List.of(1, 2, 3)));

        assertFalse(actual);
    }

    @Test
    public void theEmptySetIsDisjointWithItself() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isDisjoint(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    public void emptySetIsDisjointWithNonEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .isDisjoint(
                new CustomSet<>(List.of(1)));

        assertTrue(actual);
    }

    @Test
    public void nonEmptySetIsDisjointWithEmptySet() {
        final boolean actual = new CustomSet<>(List.of(1))
            .isDisjoint(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    public void setsAreNotDisjointIfTheyShareAnElement() {
        final boolean actual = new CustomSet<>(List.of(1, 2))
            .isDisjoint(
                new CustomSet<>(List.of(2, 3)));

        assertFalse(actual);
    }

    @Test
    public void setsAreDisjointIfTheyShareNoElements() {
        final boolean actual = new CustomSet<>(List.of(1, 2))
            .isDisjoint(
                new CustomSet<>(List.of(3, 4)));

        assertTrue(actual);
    }

    @Test
    public void emptySetsAreEqual() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .equals(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertTrue(actual);
    }

    @Test
    public void emptySetIsNotEqualToNonEmptySet() {
        final boolean actual = new CustomSet<>(Collections.EMPTY_LIST)
            .equals(
                new CustomSet<>(List.of(1, 2, 3)));

        assertFalse(actual);
    }

    @Test
    public void nonEmptySetIsNotEqualToEmptySet() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .equals(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertFalse(actual);
    }

    @Test
    public void setsWithTheSameElementsAreEqual() {
        final boolean actual = new CustomSet<>(List.of(1, 2))
            .equals(
                new CustomSet<>(List.of(2, 1)));

        assertTrue(actual);
    }

    @Test
    public void setsWithDifferentElementsAreNotEqual() {
        final boolean actual = new CustomSet<>(List.of(1, 2, 3))
            .equals(
                new CustomSet<>(List.of(1, 2, 4)));

        assertFalse(actual);
    }

    @Test
    public void addToEmptySet() {
        final int element = 3;
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(element)));
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST);

        actual.add(element);

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertTrue(expected.equals(actual));
    }

    @Test
    public void addToNonEmptySet() {
        final int element = 3;
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(1, 2, 3, 4)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 4));

        actual.add(element);

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertTrue(expected.equals(actual));
    }

    @Test
    public void addingAnExistingElementDoesNotChangeTheSet() {
        final int element = 3;
        final CustomSet<Integer> expected = new CustomSet<>(
            Collections.unmodifiableList(List.of(1, 2, 3)));
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3));

        actual.add(element);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void intersectionOfTwoEmptySetsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getIntersection(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void intersectionOfAnEmptySetAndNonEmptySetIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getIntersection(
                new CustomSet<>(List.of(3, 2, 5)));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void intersectionOfANonEmptySetAndAnEmptySetIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3, 4))
            .getIntersection(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());

    }

    @Test
    public void intersectionOfTwoSetsWithNoSharedElementsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(List.of(1, 2, 3))
            .getIntersection(
                new CustomSet<>(List.of(4, 5, 6)));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void intersectionOfTwoSetsWithSharedElementsIsASetOfTheSharedElements() {
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
    public void differenceOfTwoEmptySetsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getDifference(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void differenceOfAnEmptySetAndNonEmptySetIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getDifference(
                new CustomSet<>(List.of(3, 2, 5)));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void differenceOfANonEmptySetAndAnEmptySetIsTheNonEmptySet() {
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
    public void differenceOfTwoNonEmptySetsIsASetOfElementsThatAreOnlyInTheFirstSet() {
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
    public void unionOfTwoEmptySetsIsAnEmptySet() {
        final CustomSet<Integer> actual = new CustomSet<>(Collections.EMPTY_LIST)
            .getUnion(
                new CustomSet<>(Collections.EMPTY_LIST));

        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void unionOfAnEmptySetAndNonEmptySetIsTheNonEmptySet() {
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
    public void unionOfANonEmptySetAndAnEmptySetIsTheNonEmptySet() {
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
    public void unionOfTwoNonEmptySetsContainsAllUniqueElements() {
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
