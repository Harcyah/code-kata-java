package com.harcyah.kata.exercism.strain;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@UtilityClass
public class Strain {

    public static <T> List<T> keep(List<T> input, Predicate<T> predicate) {
        List<T> output = new ArrayList<>();
        for (T element : input) {
            if (predicate.test(element)) {
                output.add(element);
            }
        }
        return output;
    }

    public static <T> List<T> discard(List<T> input, Predicate<T> predicate) {
        List<T> output = new ArrayList<>();
        for (T element : input) {
            if (!predicate.test(element)) {
                output.add(element);
            }
        }
        return output;
    }

}
