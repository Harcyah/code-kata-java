package com.harcyah.kata.exercism.accumulate;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

@UtilityClass
public class Accumulate {

    public static <T> List<T> accumulate(List<T> input, UnaryOperator<T> lambda) {
        List<T> output = new ArrayList<>();
        for (T element : input) {
            output.add(lambda.apply(element));
        }
        return output;
    }

}
